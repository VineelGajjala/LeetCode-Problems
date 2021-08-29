class Solution {
    public int thirdMax(int[] nums) {
                int len = nums.length;

        double max1 = (double) Integer.MIN_VALUE-1;
        double max2 = (double) Integer.MIN_VALUE-1;
        double max3 = (double) Integer.MIN_VALUE-1;

        for (int i = 0; i < nums.length; i++) {
            double n = (double)nums[i];
            if (n == max1 || n == max2 || n == max3) {
                continue;
            }
            if (n > max3) {
                max1 = max2;
                max2 = max3;
                max3 = n;
            } else if (n > max2) {
                max1 = max2;
                max2 = n;
            } else if (n > max1) {
                max1 = n;
            }
        }
        return max1 == ((double) Integer.MIN_VALUE-1) ? (int) max3 : (int) max1;
    }
}