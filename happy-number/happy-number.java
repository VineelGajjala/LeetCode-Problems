class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        while (!set.contains(n)) {
            if (n == 1) {
                return true;
            }
            int temp = 0;
            set.add(n);
            while (n > 0) {
                temp += (n % 10) * (n % 10);
                n /= 10;
            }
            n = temp;
        }
        return false;
    }
}