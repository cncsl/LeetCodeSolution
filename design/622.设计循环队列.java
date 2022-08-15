/*
 * @lc app=leetcode.cn id=622 lang=java
 *
 * [622] 设计循环队列
 */

// @lc code=start
class MyCircularQueue {
    
    private int[] elements;
    private int front;
    private int rear;
    private int capacity;

    public MyCircularQueue(int k) {
        capacity = k + 1;
        elements = new int[capacity];
        front = 0;
        rear = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        elements[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? - 1 : elements[front];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : elements[(rear - 1 + capacity) % capacity];
    }
    
    public boolean isEmpty() {
        return front == rear;
    }
    
    public boolean isFull() {
        return ((rear + 1) % capacity) == front;
    }

}

// @lc code=end

