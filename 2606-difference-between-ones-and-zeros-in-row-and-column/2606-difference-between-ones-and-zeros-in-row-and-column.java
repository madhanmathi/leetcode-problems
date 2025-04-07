class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] arr1=new int[grid.length];
        int[] arr2=new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
             arr1[i]=arr1[i]+grid[i][j];
            }
        }
         for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
             arr2[i]=arr2[i]+grid[j][i];
            }
        }
        int n=arr1.length;
        int m=arr2.length;
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
          grid[i][j]=arr1[i]+arr2[j]-(m-arr1[i])-(n-arr2[j]);
        }
       }
       return grid;
    }
}