class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int current = 0;
        int counter = 0;
        for (int num : nums) {
            current += num;
            arr[counter] = current;
            counter++;
        }
        return arr;
    }
}