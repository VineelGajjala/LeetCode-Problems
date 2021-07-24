class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> st = new HashMap<>();
        Map<Character, Character> ts = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (st.containsKey(c1)) {
                if (st.get(c1) != c2) {
                    return false;
                }
            } else {
                st.put(c1,c2);
            }
            
            
            if (ts.containsKey(c2)) {
                if (ts.get(c2) != c1) {
                    return false;
                }
            }else {
                ts.put(c2,c1);
            }
            
            
        }
        return true;
        
    }
}