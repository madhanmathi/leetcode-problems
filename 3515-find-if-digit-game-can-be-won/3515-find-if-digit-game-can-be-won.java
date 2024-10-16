class Solution {
    public boolean canAliceWin(int[] nums) {
         int alicesum1=0;
        int alicesum2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                alicesum1 += nums[i];
            }else{
                alicesum2 += nums[i];
            }
        }
         if(alicesum1>alicesum2 || alicesum2>alicesum1){
            return true;
         }
         return false;
    }
}