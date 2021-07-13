class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans = new ArrayList<>();
        int len = nums.length;
        
        for(int i = 0; i< len; i++){
            int curr = nums[i];
            
            while(i < len - 1 && nums[i]+1 == nums[i+1]){
                i++;        //moving forward pointer
            }
            
            if(curr == nums[i]){
                ans.add(curr + ""); //converting int to string
            }else{
                ans.add(curr + "->" + nums[i]);
            } 
        }
        return ans;
    }
}
