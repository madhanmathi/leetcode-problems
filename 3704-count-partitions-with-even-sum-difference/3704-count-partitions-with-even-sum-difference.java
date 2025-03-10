class Solution {
    public int countPartitions(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
           count+=arr[i];
        }
        int sum=0;
        int val=0;
        for(int i=0;i<n-1;i++){
            sum=sum+arr[i];
            if((sum-(count-sum))%2==0) val++;
        }
        return val;
    }
}