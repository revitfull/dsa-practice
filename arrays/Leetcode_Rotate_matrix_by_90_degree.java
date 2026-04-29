// 90 degree rotation = transpose + reverse row 
// 180 degree rotation = reverse row + reverse column 
// 270 degree rotation = transpose + reverse column

class Solution {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        
        transpose(matrix);
        reverseRows(matrix);
    }

    private void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            // j starts at i to only swap the upper triangle
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private void reverseRows(int[][] matrix) {
        for (int[] row : matrix) {
            int left = 0;
            int right = row.length - 1;
            while (left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++;
                right--;
            }
        }
    }
}