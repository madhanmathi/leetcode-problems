class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
     Arrays.sort(nums);
     int count=1;
     int max=1;
     for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]) continue;
        if((nums[i]+1)==nums[i+1]) count++;
        else count=1;
        max=Math.max(max,count);
     }
     return max;
    }
}