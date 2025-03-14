class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        if(n<=2) return sum;
       if(n%2!=0) sum=sum+sum;
       int val=3;
       while(val<n){
       for(int i=0;i<=n-val;i++){
        for(int j=i;j<i+val;j++){
            sum=sum+arr[j];
        }
       }
       val=val+2;
       }
       return sum;
    }
}