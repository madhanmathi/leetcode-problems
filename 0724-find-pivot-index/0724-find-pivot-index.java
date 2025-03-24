class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int[] left=new int[nums.length];
        left[0]=0;
        for(int i=1;i<nums.length;i++){
           left[i]=left[i-1]+nums[i-1];
        }
        int[] right=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum=sum-nums[i];
            right[i]=sum;
        }
        for(int i=0;i<nums.length;i++){
            if(left[i]==right[i]) return i;
        }
        return -1;
    }
}