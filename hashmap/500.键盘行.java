/*
 * @lc app=leetcode.cn id=500 lang=java
 *
 * [500] 键盘行
 */

// @lc code=start
class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> keyboard = createKeyboard();
        List<String> resultList = new ArrayList<>();
        loop : for (String word : words) {
            int lineNumber = keyboard.get(Character.toUpperCase(word.charAt(0)));
            for (int i = 1; i < word.length(); i++) {
                if (lineNumber != keyboard.get(Character.toUpperCase(word.charAt(i)))) {
                    continue loop;
                }
            }
            resultList.add(word);
        }
        return resultList.toArray(new String[0]);
    }

    private Map<Character, Integer> createKeyboard(){
        Map<Character, Integer> keyboard = new HashMap<>();
        //第一行十个字母
        keyboard.put('Q', 1);
        keyboard.put('W', 1);
        keyboard.put('E', 1);
        keyboard.put('R', 1);
        keyboard.put('T', 1);
        keyboard.put('Y', 1);
        keyboard.put('U', 1);
        keyboard.put('I', 1);
        keyboard.put('O', 1);
        keyboard.put('P', 1);
        //第二行九个字母
        keyboard.put('A', 2);
        keyboard.put('S', 2);
        keyboard.put('D', 2);
        keyboard.put('F', 2);
        keyboard.put('G', 2);
        keyboard.put('H', 2);
        keyboard.put('J', 2);
        keyboard.put('K', 2);
        keyboard.put('L', 2);
        //第三行
        keyboard.put('Z', 3);
        keyboard.put('X', 3);
        keyboard.put('C', 3);
        keyboard.put('V', 3);
        keyboard.put('B', 3);
        keyboard.put('N', 3);
        keyboard.put('M', 3);
        return keyboard;
    }
}
// @lc code=end

