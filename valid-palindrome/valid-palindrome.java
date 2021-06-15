class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        s = s.toLowerCase();
        
        int start = 0;
        int end = s.length() - 1;
        
        while (end >= start) {
            while (!Character.isLetterOrDigit(s.charAt(start)) && start < s.length() - 1) {
                start += 1;
            }
            while (!Character.isLetterOrDigit(s.charAt(end)) && end > 0) {
                end -= 1;
            }
            if (start > end) {
                return true;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start += 1;
            end -= 1;
            
        }
        return true;
    }
}