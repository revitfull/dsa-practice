class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        List<Integer> list = new ArrayList<>();

        while(top<=bottom && left<=right){
            
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int j=top; j<=bottom; j++){
                list.add(matrix[j][right]);
            }
            right--;

            if(top<=bottom){
                for(int x=right; x>=left; x--){
                    list.add(matrix[bottom][x]);
                }
                bottom--;
            }
            
            if(left<=right){
                for(int y=bottom; y>=top; y--){
                    list.add(matrix[y][left]);
                }
                left++;
            }
            
        }
        return list;
    }
}