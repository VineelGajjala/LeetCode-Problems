class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<String>();
        String str = "";
        helper(n, arr, str, 0);
        return arr;
    }
    
    public void helper(int n, List<String> list, String str, int open) {
        if (str.length() == n * 2) {
            list.add(str);
            return;
        }
        //open case
        if (open + str.length() < n * 2) {
            helper(n, list, str + "(", open + 1);
        } 
        if (open > 0) {
            helper(n, list, str + ")", open - 1);
        }
        
    }
}