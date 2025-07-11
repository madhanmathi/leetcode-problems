class Solution {
    public int minOperations(int n) {
       int[] arr=new int[n];
       int k=1;
       for(int i=0;i<n;i++){
       arr[i]=k;
       k+=2;
       } 
      int sum=0;
      for(int i=0;i<n;i++){
        if(arr[i]>n) sum+=arr[i]-n;
      }
      return sum;
    }
}