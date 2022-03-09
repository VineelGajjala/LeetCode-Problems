class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>(); //using set of list bcz od duplicate.
        List<Integer> res=new ArrayList<>();
		
		//sort this bcz [0,-1,1] and [1,0,-1] will treat as single ans                                                                 
        Arrays.sort(nums);                                           
        
        for(int i=0;i<nums.length;i++)
        {
            int target=-(nums[i]);
            HashSet<Integer> temp=new HashSet<Integer>();
            for(int j=i+1;j<nums.length;j++)
            {
                if(temp.contains(target-nums[j]))
                {
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(target-nums[j]);
                    ans.add(new ArrayList(res));
                    res.clear();
                }
                temp.add(nums[j]);
                
            }
        }
        return new ArrayList(ans);
    }
}