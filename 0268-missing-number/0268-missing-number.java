class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = n * (n - 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}