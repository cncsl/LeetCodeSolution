/**
 * https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 */
class Solution {
    public char firstUniqChar(String s) {
        //LinkedHashMap 是有序哈希表
        //Char Key Single Value，当重复时 value 为 false
        Map<Character, Boolean> ckdv = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            boolean isSingle = !ckdv.containsKey(c);
            ckdv.put(c, isSingle);
        }
        for (Map.Entry<Character, Boolean> charAndSingle : ckdv.entrySet()) {
            if (Boolean.TRUE.equals(charAndSingle.getValue())) {
                return charAndSingle.getKey();
            }
        }
        return ' ';
    }
}