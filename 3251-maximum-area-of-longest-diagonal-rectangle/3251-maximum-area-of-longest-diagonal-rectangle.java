class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        double max=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
          double val=Math.sqrt((arr[i][0]*arr[i][0])+(arr[i][1]*arr[i][1]));
          if(val>max){
            max=val;
            res=arr[i][0]*arr[i][1];
          }
          else if(val==max){
            int ans=arr[i][0]*arr[i][1];
           res=Math.max(ans,res);
          }
        }
        return res;
    }
}