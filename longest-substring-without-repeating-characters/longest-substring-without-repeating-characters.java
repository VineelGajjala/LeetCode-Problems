class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = 0;
            int location = i;
            Set<Character> hash = new HashSet<Character>();
            Character curr = s.charAt(location);
            while (!hash.contains(curr)) {
                hash.add(curr);
                val += 1;
                location += 1;
                if (location != s.length()) {
                    curr = s.charAt(location);
                }
            }
            if (val > max) {
                max = val;
            }
            
        }
        return max;
    }
}