class Solution {
    private static int[] keys = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};      
    private static String[] values = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        int counter = 0;
        
        
        while(num > 0){
            if(num >= keys[counter]){
                s.append(values[counter]);
                num -= keys[counter];
            }
            else
                counter++;
        }
        
        return s.toString();
        
    }
}