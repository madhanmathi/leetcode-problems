class Solution {
    public int differenceOfSum(int[] nums) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
           a=a+nums[i];
        }
        for(int i=0;i<nums.length;i++){
        while(nums[i]>0){
            int rem=nums[i]%10;
            b=b+rem;
            nums[i]=nums[i]/10;
        }
        }
        return a-b;
    }
}