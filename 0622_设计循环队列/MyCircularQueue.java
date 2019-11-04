
import java.util.Arrays;

/**
 * @author winter
 * @date 2019/11/4 21:42
 */
public class MyCircularQueue {

    private int[] queue;
    private int size;
    private int head;
    private int tail;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        head = tail = 0;
        queue = new int[k];
        size = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (getSise() == queue.length) return false;
        if (getSise() == 0){
            head = tail = 0;
        }else {
            tail =  (++tail % queue.length);
        }
        queue[tail] = value;
        size++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (getSise() == 0) return false;
        head = (++head % queue.length);
        size--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        return getSise() == 0 ? -1:queue[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
       return getSise() == 0 ? -1:queue[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
       return getSise() == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return getSise() == queue.length;
    }

    private int getSise(){
        return size;
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(7);
        myCircularQueue.enQueue(0);
        int front = myCircularQueue.Front();
        myCircularQueue.enQueue(4);
        int rear = myCircularQueue.Rear();
        myCircularQueue.enQueue(6);
        myCircularQueue.enQueue(3);
        System.out.println(Arrays.toString(myCircularQueue.queue));
        int rear1 = myCircularQueue.Rear();
        myCircularQueue.deQueue();
        int front1 = myCircularQueue.Front();
        System.out.println(front+" "+ rear +" " +rear1+" "+front1);
        System.out.println(Arrays.toString(myCircularQueue.queue));
//        ["MyCircularQueue","enQueue","Front","enQueue","Rear","enQueue","enQueue","Rear","deQueue","Front","deQueue","Front"]
//[[7],[0],[],[4],[],[6],[3],[],[],[],[],[]]
    }
}
