/*
 * @lc app=leetcode.cn id=166 lang=java
 *
 * [166] 分数到小数
 */

// @lc code=start
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long numeratorL = (long) numerator;
        long denominatorL = (long) denominator;
        //直接整除
        if (numeratorL % denominatorL == 0) {
            return String.valueOf(numeratorL / denominatorL);
        }

        StringBuilder resultBuilder = new StringBuilder();
        //有切仅有一个为负数时，结果为负值
        if (numeratorL < 0 ^ denominatorL < 0) {
            resultBuilder.append('-');
        }

        long numeratorLAbs = Math.abs(numeratorL);
        long denominatorLAbs = Math.abs(denominatorL);
        //整数部分和小数点
        resultBuilder.append(numeratorLAbs / denominatorLAbs);
        resultBuilder.append('.');

        //小数部分，用哈希表记录曾经出现过的余数，用于发现循环部分
        Map<Long, Integer> remainderIndexMap = new HashMap<>();
        StringBuilder fractionPart = new StringBuilder();
        
        int index = 0;
        long remainder = numeratorLAbs % denominatorLAbs;
        while(remainder != 0 && Objects.isNull(remainderIndexMap.putIfAbsent(remainder, index++))) {
            remainder *= 10;
            fractionPart.append(remainder / denominatorLAbs);
            remainder %= denominatorLAbs;
        }

        //小数部分有循环
        if (remainder != 0) {
            int insertIndex = remainderIndexMap.get(remainder);
            fractionPart.insert(insertIndex, '(');
            fractionPart.append(')');
        }
        resultBuilder.append(fractionPart.toString());

        return resultBuilder.toString();
    }
}
// @lc code=end

