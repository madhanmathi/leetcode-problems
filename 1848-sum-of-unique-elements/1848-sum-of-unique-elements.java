class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
            }
             if(count==1) sum=sum+nums[i];
             count=0;
        }
        return sum;
    }
}