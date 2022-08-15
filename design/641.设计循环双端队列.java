/*
 * @lc app=leetcode.cn id=641 lang=java
 *
 * [641] 设计循环双端队列
 */

// @lc code=start
class MyCircularDeque {

    private int[] elements;

    private int front;

    private int rear;

    private int capacity;

    public MyCircularDeque(int k) {
        capacity = k + 1;
        elements = new int[capacity];
    }
    
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        //需保证 front 指向队列的第一个元素，先移动索引再存新数据
        front = (front - 1 + capacity) % capacity;
        elements[front] = value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        //需保证 rear 指向队列的“下一个”元素，先存❤新数据再移动索引
        elements[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear = (rear - 1 + capacity) % capacity;
        return true;
    }
    
    public int getFront() {
        return isEmpty() ? -1 : elements[front];
    }
    
    public int getRear() {
        return isEmpty() ? -1 : elements[(rear - 1 + capacity) % capacity];
    }
    
    public boolean isEmpty() {
        return front == rear;
    }
    
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}

// @lc code=end

