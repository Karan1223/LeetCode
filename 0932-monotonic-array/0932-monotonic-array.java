class Solution {
    public boolean isMonotonic(int[] nums) {
         boolean increasing = false; // Flag to track if the array is increasing
        boolean decreasing = false; // Flag to track if the array is decreasing

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                increasing = true;
            } else if (nums[i - 1] > nums[i]) {
                decreasing = true;
            }

            // If both increasing and decreasing are true, it's not monotonic
            if (increasing && decreasing) {
                return false;
            }
        }

        // If either increasing or decreasing is true, it's monotonic
        return true;
    }
}