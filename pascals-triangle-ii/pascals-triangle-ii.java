class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        if (rowIndex == 0) {
            return list;
        } 
        list.add(1);
        if (rowIndex == 1) {
            return list;
        }
        
        
        List<Integer> temp;
        for (int i = 0; i <= rowIndex; i++) {
            temp = list;
            list = Arrays.asList(new Integer[i+1]);
            list.set(0,1);
            list.set(i,1);
                for(int j=1;j<i;j++) {
                    list.set(j,temp.get(j-1)+temp.get(j));
                }
        }
        
        return list;
    }
}