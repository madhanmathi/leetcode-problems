class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int k=0;
        int val=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                    count+=mat[i][j];
            }
            if(count>k){
                k=count;
                val=i;
            }
        }
        int[] arr=new int[2];
        arr[0]=val;
        arr[1]=k;
        return arr;
    }
}