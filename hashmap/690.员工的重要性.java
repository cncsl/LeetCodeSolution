/*
 * @lc app=leetcode.cn id=690 lang=java
 *
 * [690] 员工的重要性
 */

// @lc code=start
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {

    private Map<Integer, Employee> employeMap;

    /**
     * 根据公司全部员列表查询其重要性
     *
     * @param employees 全部员工列表
     * @param id        要查询的员工 id
     * @return 员工重要性
     */
    public int getImportance(List<Employee> employees, int id) {
        employeMap = new HashMap<>();
        for (Employee employee : employees) {
            employeMap.put(employee.id, employee);
        }

        Employee employee = employeMap.get(id);
        return getImportanceByEmployee(employee);
    }

    /**
     * 查询一个员工的重要性
     *
     * @param employee 员工对象
     * @return 员工重要性
     */
    private int getImportanceByEmployee(Employee employee) {
        int importance = employee.importance;
        if (employee.subordinates != null) {
            for (int subordinateId : employee.subordinates) {
                importance += getImportanceByEmployee(employeMap.get(subordinateId));
            }
        }
        return importance;
    }

}
// @lc code=end

