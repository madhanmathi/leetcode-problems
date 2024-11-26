class Solution {
    public int maximizeSum(int[] nums, int k) {
      Arrays.sort(nums);
      int a=nums[nums.length-1];
      int b=nums[nums.length-1];
      for(int i=1;i<k;i++){
      a=a+(b+1);
      b++;
      }  
      return a;
    }
}