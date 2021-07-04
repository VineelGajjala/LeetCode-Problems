class Solution {
    public int countPrimes(int n) {
        
        boolean[] dp = new boolean[n]; 
        
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (dp[i] == false) { 
                for (int j = 2; i*j < n; j++) {
                    dp[i*j] = true;
                }
                count++;
            }
        }
        
        return count;
    }
}