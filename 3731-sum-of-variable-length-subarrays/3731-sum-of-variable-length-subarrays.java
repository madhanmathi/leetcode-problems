class Solution {
    public int subarraySum(int[] arr) {
        int n=arr.length;
        int sum=0;
       for(int i=0;i<n;i++){
        int start=Math.max(0,i-arr[i]);
        for(int j=start;j<=i;j++){
            sum=sum+arr[j];
        }
       } 
       return sum;
    }
}