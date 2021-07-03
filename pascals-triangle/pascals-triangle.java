class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<List<Integer>>();
        
        tri.add(new ArrayList<>());
        tri.get(0).add(1);
        
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> curr = new ArrayList<Integer>();
            List<Integer> prevRow = tri.get(rowNum - 1);
            
            curr.add(1);
            
            for (int j = 1; j < rowNum; j++) {
                curr.add(prevRow.get(j-1) + prevRow.get(j));
            }
            curr.add(1);
            tri.add(curr);
        }
        return tri;
    }
}