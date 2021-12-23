import java.lang.Math;
import java.util.Arrays;   

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int med = nums[nums.length / 2];
        if (nums.length % 2 == 0 && nums.length != 0) {
            med = nums[nums.length / 2] + nums[(nums.length + 1) / 2];
            med /= 2;
        }
        int count = 0;
        for (int num : nums) {
            count += Math.abs(med - num);
        }
        return count;
    }
}