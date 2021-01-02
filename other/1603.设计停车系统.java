/*
 * @lc app=leetcode.cn id=1603 lang=java
 *
 * [1603] 设计停车系统
 */

// @lc code=start
class ParkingSystem {

    private int[] parkings;

    public ParkingSystem(int big, int medium, int small) {
        parkings = new int[3];
        parkings[0] = big;
        parkings[1] = medium;
        parkings[2] = small;
    }

    public boolean addCar(int carType) {
        if (parkings[carType - 1] > 0) {
            parkings[carType - 1]--;
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
// @lc code=end

