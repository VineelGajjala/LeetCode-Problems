class Solution {
    public boolean isPerfectSquare(int num) {
        int s=0;
        int l=num;
        boolean ans=false;
        int m=0;
        if(num==0 ||num==1){
            return true;
        }
        else{
            while(l>=s){
                m=(s+l)/2;
                if(num/m==m && num%m==0){
                    ans=true;
                }
                if(num/m<m){
                    l=m-1;
                }
                else{
                    s=m+1;
                }
            }
            return ans;
        }
    }
}