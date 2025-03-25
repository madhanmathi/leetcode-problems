class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<=1) return 0;
        int val=0;
        int count=0;
        int idx = 0;
        int prev=nums[0]-nums[1];
        int n = nums.length-1;
        for(int i=1;i< n;i++){
            if(nums[i]-nums[i+1]==prev){
                count += (i-idx);
            }
            else{
                prev=nums[i]-nums[i+1];
                idx = i;
            }
        }
        return count;
    }
}