/*
 * @lc app=leetcode.cn id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {

    private static final String FIZZ = "Fizz";

    private static final String BUZZ = "Buzz";

    public List<String> fizzBuzz(int n) {
        //从 1～n 个元素，一次初始化不扩容
        List<String> result = new ArrayList(n);
        for (int i = 1; i <= n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if (i % 3 == 0) {
                stringBuilder.append(FIZZ);
            }
            if (i % 5 == 0) {
                stringBuilder.append(BUZZ);
            }
            if (stringBuilder.length() == 0) {
                stringBuilder.append(i);
            }
            result.add(stringBuilder.toString());
        }
        return result;
    }
}
// @lc code=end

