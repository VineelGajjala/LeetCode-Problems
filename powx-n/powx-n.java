class Solution {
    public double myPow(double number, int power) {
        if (power == 0) { return 1; }
        
        double output = myPow(number, power / 2);
        output = output * output;
        if (power % 2 == 0) {
            return output;
        } else if (power > 0) {
            return number * output;
        } else {
            return output / number;
        }
    }
}