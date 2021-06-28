class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climbHelper(0, n, memo);
    }
    public int climbHelper(int x, int n, int memo[]) {
        if (x == n) {
            return 1;
        } else if (x > n) {
            return 0;
        } else if (memo[x] > 0) {
            return memo[x];
        }
         memo[x] = climbHelper(x + 1, n, memo) + climbHelper(x + 2, n, memo);
        return memo[x];
    }
}