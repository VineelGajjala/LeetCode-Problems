class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        
        for (int x : gain) {
            curr += x;
            if (curr > max) {
                max = curr;
            }
        }
        return (max > 0) ? max : 0;
        
    }
}