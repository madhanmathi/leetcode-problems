class Solution {
    public int[][] construct2DArray(int[] res, int m, int n) {
        int[][] arr=new int[m][n];
        int[][] val=new int[0][0];
        if(m*n!=res.length) return val;
         int k=0;
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=res[k++];
            }
         }
         return arr;
    }
}