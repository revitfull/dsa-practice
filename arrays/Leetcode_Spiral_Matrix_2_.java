class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int addintomatrix = 1;
        
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                matrix[top][i] = addintomatrix++;
            }
            top++;

            for(int j=top; j<=bottom; j++){
                matrix[j][right] = addintomatrix++;
            }
            right--;

            if(top<=bottom){
                for(int x=right; x>=left; x--){
                    matrix[bottom][x] = addintomatrix++;
                }
                bottom--;
            }
            
            if(left<=right){
                for(int y=bottom; y>=top; y--){
                    matrix[y][left] = addintomatrix++;
                }
                left++;
            }
        }
        return matrix;
    }
}