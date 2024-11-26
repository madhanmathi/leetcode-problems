class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]<=0&&nums[i+1]>=0){
            int min=0-nums[i];
            int max=nums[i+1];
             if(min<max) return nums[i];
          return nums[i+1];
        }
         
       } 
      if(nums[nums.length-1]<0) return nums[nums.length-1];
      return nums[0];
    }
}