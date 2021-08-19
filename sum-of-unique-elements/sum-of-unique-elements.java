class Solution {
    public int sumOfUnique(int[] nums) {
       
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i<nums.length ; i++){
            if(set.contains(nums[i])){
                if(!list.contains(nums[i])) 
                    list.add(nums[i]);
            }
            else{
                set.add(nums[i]);
                sum += nums[i];
            }
        }
        int i = 0;
        while(i <list.size()){
            sum -= list.get(i);
            i++;
        }
        return sum;
    }
}