class Solution {
    List<Integer>ans=new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        for(int i=1;i<=9;i++){
            helper(i,n);
        }
        return ans;
    }
    public void helper(int x,int n){
        if(x<=n)ans.add(x);
        else return;
        for(int i=0;i<=9;i++){
            helper(x*10+i,n);
        }
    }
}