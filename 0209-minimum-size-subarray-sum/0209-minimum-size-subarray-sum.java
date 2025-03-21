class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int s=0;
       int e=0;
       int len=Integer.MAX_VALUE;
       int sum=0;
       for(int i=0;i<nums.length;i++){
         sum=sum+nums[e];
         while(sum>=target){
           int val=Math.abs(e-s+1);
           if(val<len) len=val;
           sum=sum-nums[s];
           s++;
         }
       e++;
       } 
       if(len==2147483647) return 0;
       return len;
    }
}