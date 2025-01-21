class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        
        while(k>0){
            int min=Integer.MAX_VALUE;
            int val=0;
            for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                 min=nums[i];
                 val=i;
            }
            }
            nums[val]=nums[val]*m;
            k--;
        }
        return nums;
    }
}