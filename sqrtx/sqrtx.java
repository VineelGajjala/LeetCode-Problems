class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        int answer = 0;
        
        if (x == 1 || x == 0) {
            return x;
        }
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid > x / mid) {
                high = mid - 1;   
            }
            else {
                low = mid + 1;
            }
            
        }
        return high;
    }
}