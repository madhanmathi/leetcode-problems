class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
       int sum=0;
       int[] left=new int[n];
       int[] right=new int[n];
       left[0]=0;
       right[n-1]=0;
       for(int i=1;i<n;i++){
        sum=sum+nums[i-1];
        left[i]=sum;
       } 
       sum=sum+nums[n-1];
       int val=0;
       for(int i=0;i<n-1;i++){
        val=val+nums[i];
        right[i]=sum-val;
       }
       for(int i=0;i<n;i++){
        nums[i]=Math.abs(left[i]-right[i]);
       }
       return nums;
    }
}