class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int i = m - 1; // Index for the end of num1 array
        int j = n - 1; // Index for the end of num2 array
        int k = m + n - 1; // Index for the merged array
        
        while (i >= 0 && j >= 0) {
            if (num1[i] >= num2[j]) {
                num1[k] = num1[i];
                i--;
            } else {
                num1[k] = num2[j];
                j--;
            }
            k--;
        }
        
        // If there are remaining elements in num2, copy them to num1
        while (j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }
    }
}
