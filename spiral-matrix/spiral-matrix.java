class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] deltaX = {0,1,0,-1};
        int[] deltaY = {1,0,-1,0};
        
        int direction = 0 ;
        
        boolean[][] visited = new boolean[m][n];

        int[] coordinate = new int[2];
        coordinate[0] = 0;
        coordinate[1] = 0;
        
        List<Integer> res = new ArrayList<>();
        
        res.add(matrix[0][0]);
        visited[0][0] = true;
        
        while(true){
            int dir =direction % 4;
            int newX = coordinate[0] + deltaX[dir];
            int newY = coordinate[1] + deltaY[dir];
            
            if(newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY]){
                coordinate[0] = newX;
                coordinate[1] = newY;
                
                visited[ newX ][ newY ] = true;
                res.add(matrix[newX][newY]);
            }else{
                if(res.size() == m * n) return res;
                direction++;
            }
 
            
        }

    }
}
