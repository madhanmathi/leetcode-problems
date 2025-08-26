class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        float max=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
          float val=(float)Math.sqrt((arr[i][0]*arr[i][0])+(arr[i][1]*arr[i][1]));
          if(val>max){
           // System.out.print(arr[i][0]+" "+arr[i][1]+"|");
            max=val;
            res=arr[i][0]*arr[i][1];
    if(res==48||res==1848) System.out.print(val+"-"+res+arr[i][0]+" "+arr[i][1]+"|");
          }
          else if(val==max){
            int ans=arr[i][0]*arr[i][1];
           res=Math.max(ans,res);
          }
        }
        return res;
    }
}