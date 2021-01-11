/*
 * @lc app=leetcode.cn id=1556 lang=java
 *
 * [1556] 千位分隔数
 */

// @lc code=start
class Solution {
    public String thousandSeparator(int n) {
        int counter = 0;
        Deque<Character> deque = new LinkedList<>();
        do {
            if (counter == 3) {
                deque.addFirst('.');
                counter = 0;
            }
            deque.addFirst((char) (n % 10 + '0'));
            counter++;
            n /= 10;
        } while (n > 0);
        StringBuilder resultBuilder = new StringBuilder();
        while (!deque.isEmpty()) {
            resultBuilder.append(deque.removeFirst());
        }
        return resultBuilder.toString();
    }
}
// @lc code=end

