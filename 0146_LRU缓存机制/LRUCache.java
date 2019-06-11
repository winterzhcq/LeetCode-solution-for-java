
/**
 * @author winter
 * @date 2019/6/11 15:16
 */

import java.util.HashMap;;
import java.util.Map;

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
public class LRUCache {
    /**
     * 构造一个简单的双向链表
     */
    private class Node{
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString(){
            return value+"";
        }
    }

    // LRU容量
    private int capacity;

    // 头结点
    private Node frist;

    // 尾结点
    private Node last;

    // 构造一个map来存每个结点的Key,value值
    private Map<Integer,Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
    }

    // 获取元素
    public int get(int key) {
        Node node = map.get(key);
        if (node == null){
            return -1;
        }
        // 将新访问到的结点放在链表头
        updateHead(node);
        return node.value;
    }

    // 更新头结点
    private void updateHead(Node node) {
            if (node == frist)
                return;
            else if (node == last) {
                last.prev.next = null;
                last = last.prev;
            } else {
                // 删除该结点
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
            //将该结点新增到frist节点
            node.prev = null;
            node.next = frist;
            frist.prev = node;
            frist = node;
    }
    // 存元素
    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null){
            node = new Node(key,value);
            if (map.size() == capacity)
                removeLast();
            addFrist(node);
            map.put(key,node);
        }else {
            node.value = value;
            updateHead(node);
        }
    }

    // 新增第一个节点
    private void addFrist(Node node) {
        if (map.isEmpty()){
            frist = node;
            last = node;
        }else {
            frist.prev = node;
            node.next = frist;
            frist = node;
        }
    }

    // 删除链表最后一个元素
    private void removeLast() {
        map.remove(last.key);
        Node temp = last;
        if (temp.prev != null) {
            last = temp.prev;
            // Help GC
            temp.prev.next = null;
            temp.prev = null;
        }
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        if (frist  == null){
            res.append("NULL");
            return res.toString();
        }
        Node cur = frist;
        while(cur != last){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append(last.value + "->");
        res.append("head value is "+frist.value);
        res.append(" | list size is "+ map.size());
        return res.toString();
    }
    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        System.out.println(cache);
        cache.put(2, 2);
        System.out.println(cache);
        System.out.println(cache.get(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        System.out.println(cache);
        System.out.println(cache.get(2));      // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        System.out.println(cache);
        System.out.println(cache.get(1));       // 返回  1
        System.out.println(cache);
       // System.out.println(cache.get(2));      // 返回 -1 (未找到)
        System.out.println(cache.get(3));       // 返回  3
        System.out.println(cache);
        System.out.println(cache.get(4));      // 返回  4
        System.out.println(cache);

    }
}
