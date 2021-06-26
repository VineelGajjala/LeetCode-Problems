class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count = nums.length / 3;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for (int n : nums) {
            if(!map.containsKey(n)){
              map.put(n, 1);
           } else {
              map.put(n, map.get(n) + 1);
           }
        }
        
        for (int key : map.keySet()) {
            if (map.get(key) > count) {
                list.add(key);
            }
        }
        return list;
    }
}