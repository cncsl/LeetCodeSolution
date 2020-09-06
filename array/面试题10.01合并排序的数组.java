class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;
        int j = n - 1;
        int point = m + n - 1;

        while (i >= 0 || j >= 0) {
            if (i == -1) {
                A[point] = B[j--];
            } else if (j == -1) {
                A[point] = A[i--];
            } else if (A[i] > B[j]) {
                A[point] = A[i--];
            }else{
                A[point] = B[j--];
            }
            point--;
        }
    }
}