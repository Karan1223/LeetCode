class Solution {
    public int removeElement(int[] nums, int val) {
           int k = 0; // Initialize the length of the modified array
		      for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[k++] = nums[i];
        }
    }
    
   return k;
    }
}