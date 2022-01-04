/*
 * @lc app=leetcode.cn id=1845 lang=java
 *
 * [1845] 座位预约管理系统
 */

// @lc code=start
class SeatManager {

    private PriorityQueue<Integer> availableSeats;

    public SeatManager(int n) {
        availableSeats = new PriorityQueue<>(n);
        for (int i = 1; i <= n; i++) {
            availableSeats.add(i);
        }
    }
    
    public int reserve() {
        return availableSeats.poll();
    }
    
    public void unreserve(int seatNumber) {
        availableSeats.add(seatNumber);
    }
}
// @lc code=end

