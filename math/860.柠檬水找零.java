/*
 * @lc app=leetcode.cn id=860 lang=java
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        //现金计数，五元 fiveDollar、十元 tenDollar
        int fiveDollar = 0;
        int tenDollar = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fiveDollar++;
            } else if (bill == 10) {
                //先算找零再记收入
                if (fiveDollar > 0) {
                    fiveDollar--;
                    tenDollar++;
                } else {
                    return false;
                }
            } else if (bill == 20) {
                //找零十五元（三张五块或一张十块和一张五块）
                if (fiveDollar > 0 && tenDollar > 0) {
                    fiveDollar--;
                    tenDollar--;
                } else if (fiveDollar > 2) {
                    fiveDollar -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

