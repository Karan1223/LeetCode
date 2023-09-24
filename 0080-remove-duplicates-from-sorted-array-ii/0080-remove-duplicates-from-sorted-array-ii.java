class Solution {
    public int removeDuplicates(int[] nums) {
        
    int k = 2; // Initialize k to 2 since the first two elements are always included

    for (int i = 2; i < nums.length; i++) {
        if (nums[i] != nums[k - 2]) {
            nums[k] = nums[i];
            k++;
        }
    }
        return k;
        
    }
}