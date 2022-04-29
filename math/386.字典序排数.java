/*
 * @lc app=leetcode.cn id=386 lang=java
 *
 * [386] 字典序排数
 */

// @lc code=start
class Solution {
    public List<Integer> lexicalOrder(int n) {
        //指定大小避免后续扩容
        List<Integer> result = new ArrayList<>(n);
        
        int num = 1;
        for (int i = 0; i < n; i++) {
            result.add(num);
            if (num * 10 <= n) {
                num *= 10;
            } else {
                while (num % 10 == 9 || num + 1 > n) {
                    num /= 10;
                }
                num++;
            }
        }
        return result;
    }
}
// @lc code=end

