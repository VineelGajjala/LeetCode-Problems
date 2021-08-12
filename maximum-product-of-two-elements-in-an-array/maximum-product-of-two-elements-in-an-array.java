class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int min = -2;
        
        for (int x : nums) {
            if (x > max) {
                min = max;
                max = x;
            } else if (x > min){
                min = x;
            }
        }
        return ((max - 1) * (min - 1));
    }
}