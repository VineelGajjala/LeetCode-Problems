class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int n : nums) {
            set.add(n);
        }
        
        for (int i = 0; i < nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}