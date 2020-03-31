/*
 * @lc app=leetcode.cn id=71 lang=java
 *
 * [71] 简化路径
 */

// @lc code=start
class Solution {

    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String s : paths) {
            if ("..".equals(s)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }
            boolean isLocal = ".".equals(s) || s.isEmpty();
            if (!isLocal) {
                stack.push(s);
            }
        }
        // 无论是 Unix 风格还是 Linux 风格，文件路径的开头第一个都是 /
        StringBuilder result = new StringBuilder("/");
        for (int i = 0; i < stack.size(); i++) {
            result.append(stack.get(i));
            if (i + 1 != stack.size()) {
                result.append('/');
            }
        }
        return result.toString();
    }

}
// @lc code=end

