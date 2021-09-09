class Solution {
public boolean searchMatrix(int[][] matrix, int target) {
    int row= findRow(matrix,0,matrix.length-1,target,matrix[0].length);
    if(row==-1)
        return false;       
    int l=0, r=matrix[0].length-1;
    
    while(l<=r){
        int mid = (l+r)/2;
        if(matrix[row][mid]== target)
            return true;
        else if(matrix[row][mid]<target)
            l=mid+1;
        else
            r=mid-1;
    }
    return false;
    
}
    
    
    
    
    static int findRow(int [][] mat,int l , int r , int target, int col){
        
    while(l<=r){
        int mid = (l+r)/2;
        if(mat[mid][0]<=target && mat[mid][col-1]>=target)
            return mid;
        else if(mat[mid][0]<=target)
            l=mid+1;
        else
            r=mid-1;
    }
    return -1;
    }
}