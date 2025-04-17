class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int[] arr=new int[2];
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
             if(mat[i][j]>count){
                count=mat[i][j];
                arr[0]=i;
                arr[1]=j;
             }
            }
        }
        return arr;
    }
}