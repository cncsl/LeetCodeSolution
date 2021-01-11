/*
 * @lc app=leetcode.cn id=468 lang=java
 *
 * [468] 验证IP地址
 */

// @lc code=start
class Solution {

    private static final String IPV4 = "IPv4";
    private static final String IPV6 = "IPv6";
    private static final String NEITHER = "Neither";

    public String validateIPv4(String ip) {
        String[] nums = ip.split("\\.", -1);
        for (String x : nums) {
            if (x.length() == 0 || x.length() > 3) { return NEITHER; }
            if (x.charAt(0) == '0' && x.length() != 1) { return NEITHER; }
            for (char ch : x.toCharArray()) {
                if (!Character.isDigit(ch)) { return NEITHER; }
            }
            if ("255".compareTo(x) < 0) { return NEITHER; }
        }
        return IPV4;
    }

    public String validateIPv6(String ip) {
        String[] nums = ip.split(":", -1);
        String hexdigits = "0123456789abcdefABCDEF";
        for (String x : nums) {
            if (x.length() == 0 || x.length() > 4) { return NEITHER; }
            for (Character ch : x.toCharArray()) {
                if (hexdigits.indexOf(ch) == -1) { return NEITHER; }
            }
        }
        return IPV6;
    }

    public String validIPAddress(String IP) {
        if (IP.chars().filter(ch -> ch == '.').count() == 3) {
            return validateIPv4(IP);
        } else if (IP.chars().filter(ch -> ch == ':').count() == 7) {
            return validateIPv6(IP);
        } else { return NEITHER; }
    }

}
// @lc code=end

