class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            return ~dividend + 1;
        }
        
        boolean hasNegativeResult = dividend > 0 ^ divisor > 0;
        boolean overflow = dividend == Integer.MIN_VALUE;
        
        if (overflow) {
            dividend = Integer.MAX_VALUE;
        } else if (dividend < 0) {
            dividend = ~dividend + 1;
        }
        
        if (divisor < 0) {
            divisor = ~divisor + 1;
        }
        
        if (dividend < divisor) {
            return 0;
        }

        int quotient = 0;
        while(dividend - divisor >= 0) {
            int power = 0;
            while(dividend - (divisor << 1 << power) >= 0) {
                power++;
            }
            quotient += 1 << power;
            dividend = dividend - (divisor << power);
        }
        
        if (overflow && dividend + 1 >= divisor) {
            quotient++;
        }
        
        if (hasNegativeResult) {
            quotient = ~quotient + 1;
        }
        
        return quotient;
    }
}