
import java.util.Arrays;

/**
 * 注意front和tail重叠
 * @author winter
 * @date 2019/11/5 22:33
 */
public class MyCircularDeque {
    private int[] queue;
    private int size;
    private int front;
    private int tail;
    private int capacity;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        queue = new int[k];
        this.size = 0;
        this.capacity = k;
        front = tail = 0;
    }


    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (getSize() == queue.length) return false;
        front = (front - 1 + capacity )% capacity;
        queue[front] = value;
        size++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (getSize() == queue.length) return false;
        queue[tail] = value;
        tail = (tail +1) % capacity;
        size++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (size == 0) return false;
        front = ( front + 1 ) % capacity;
        size--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (size == 0) return false;
        tail = (tail - 1 + capacity) % capacity;
        size--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (size == 0) return -1;
        return queue[front];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (size == 0) return -1;
        return queue[(tail-1+capacity)%capacity];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == capacity;
    }

    public int getSize(){
        return this.size;
    }

    public static void main(String[] args) {
        MyCircularDeque circularDeque = new MyCircularDeque(3); // 设置容量大小为3
        circularDeque.insertLast(1);			        // 返回 true
        System.out.println(Arrays.toString(circularDeque.queue));
        circularDeque.insertLast(2);			        // 返回 true
        System.out.println(Arrays.toString(circularDeque.queue));
        circularDeque.insertFront(3);			        // 返回 true
        System.out.println(Arrays.toString(circularDeque.queue));
        circularDeque.insertFront(4);			        // 已经满了，返回 false
        System.out.println(Arrays.toString(circularDeque.queue));
        circularDeque.getRear();  				// 返回 2
        circularDeque.isFull();				        // 返回 true
        circularDeque.deleteLast();			        // 返回 true
        circularDeque.insertFront(4);			        // 返回 true
        circularDeque.getFront();				// 返回 4
        System.out.println(circularDeque.getFront());
        System.out.println(Arrays.toString(circularDeque.queue));
    }
}
