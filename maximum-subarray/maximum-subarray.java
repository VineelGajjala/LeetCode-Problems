class Solution {
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];
        
        if (nums.length == 1) {
            return max;
        }
        
        for (int i = 1; i <= nums.length -1; i++) {
            if (curr < 0) {
                curr = 0;
            }
            
            curr += nums[i];
            
            if (curr > max) {
                max = curr;
            }
        }
        return max;
        
    }
}