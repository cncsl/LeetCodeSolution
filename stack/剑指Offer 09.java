/**
 * 用栈实现队列
 * <p>
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
class CQueue {

    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public CQueue() {
        inStack = new LinkedList<>();
        outStack = new LinkedList<>();
    }


    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (!outStack.isEmpty()) {
            return outStack.pop();
        }
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
        return outStack.isEmpty() ? -1 : outStack.pop();
    }
}