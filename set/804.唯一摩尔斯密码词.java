/*
 * @lc app=leetcode.cn id=804 lang=java
 *
 * [804] 唯一摩尔斯密码词
 */

// @lc code=start
class Solution {

    private final String[] morses =
            {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", 
                    "....", "..", ".---", "-.-", ".-..", "--", 
                    "-.", "---", ".--.", "--.-", ".-.", "...", 
                    "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        if (words == null) {
            return 0;
        }
        //Set 保证唯一结果
        Set<String> seen = new HashSet<>();
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (char c : word.toCharArray()) {
                code.append(morses[c - 'a']);
            }
            seen.add(code.toString());
        }
        return seen.size();
    }

}
// @lc code=end

