class Solution {
    public int maxAscendingSum(int[] arr) {
        int sum=arr[0];
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                sum=sum+arr[i+1];
            }
         else if(arr[i+1]<=arr[i]){
            if(sum>max){
                 max=sum;
          }
          sum=arr[i+1];
        }
        }
        return Math.max(sum,max);
    }
}