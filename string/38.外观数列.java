/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {

	public static String countAndSay(int n) {
		if (n == 1) {
			return "1";
		} else {
			String prevStr = countAndSay(n - 1);
			char[] chars = prevStr.toCharArray();

			StringBuilder stringBuilder = new StringBuilder();
			char prevChar = chars[0];
			int count = 1;
			for (int i = 1; i < chars.length; i++) {
				if (chars[i] == prevChar) {
					count++;
				} else {
					stringBuilder.append(count).append(prevChar);
					prevChar = chars[i];
					count = 1;
				}
			}
			stringBuilder.append(count).append(prevChar);
			return stringBuilder.toString();
		}
	}


}
// @lc code=end

