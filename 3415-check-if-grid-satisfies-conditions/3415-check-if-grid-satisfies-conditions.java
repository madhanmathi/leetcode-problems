class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int count=0;
        int val=0;
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]!=grid[i+1][j]) return false;
            }
        }
     for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length-1;j++){
                if(grid[i][j]==grid[i][j+1]) return false;
            }
        }
        return true;
    }
}