class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        // swap row within submatrix (reverse row order)
        for(int i = 0; i < k / 2; i++){
            int topRow = x + i;
            int bottomRow = x + k - 1 - i;
            for(int j = 0; j < k; j++){
                int temp = grid[topRow][y + j];
                grid[topRow][ y + j]= grid[bottomRow][y + j];
                grid[bottomRow][y + j] = temp;
            }
        }
        
        
        return grid;
    }
}