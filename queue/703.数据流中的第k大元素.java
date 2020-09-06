import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=703 lang=java
 *
 * [703] 数据流中的第K大元素
 */
class KthLargest {

    private PriorityQueue<Integer> queue;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++)
            add(nums[i]);
    }

    public int add(int val) {
        if (queue.size() < k)
            queue.add(val);
        else if (queue.peek() < val) {
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such: KthLargest
 * obj = new KthLargest(k, nums); int param_1 = obj.add(val);
 */
