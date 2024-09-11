class Solution {
    public int diagonalSum(int[][] arr) {
     return func(arr);   
    }
    static int func(int[][] arr){
        int result=0;
         for(int i=0;i<arr.length;i++){
            for (int j = 0; j<arr[i].length; j++) {
                if(i==j||j==arr.length-1-i){
                     result=result+arr[i][j];
                     //System.out.println(result);
                }
            }
         }
    return result;
}
}