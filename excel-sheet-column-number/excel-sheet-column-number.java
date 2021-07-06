class Solution {
    public int titleToNumber(String columnTitle) {
        int val = 0;
        int power = 0;
        
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char curr = columnTitle.charAt(i);
            int num = (curr - 'A') + 1;
            val += (int)(Math.pow(26, power) * num);
            power += 1;
            
        }
        return val;
    }
}