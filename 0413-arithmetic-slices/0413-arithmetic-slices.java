class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<=1) return 0;
        int count=0 ,  idx = 0 , prev=nums[0]-nums[1] ,n = nums.length-1;
        for(int i=1;i< n;i++){
            if(nums[i]-nums[i+1]==prev) count += (i-idx);
            else{
                prev=nums[i]-nums[i+1];
                idx = i;
            }
        }
        return count;
    }
}