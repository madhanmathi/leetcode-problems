class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++) sum+=nums[i];
        int[] left=new int[n];
        left[0]=0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        int[] right=new int[n];
        for(int i=0;i<n;i++){
            sum-=nums[i];
            right[i]=sum;
        }
        for(int i=0;i<n;i++){
            if(left[i]==right[i]) return i;
        }
        return -1;
    }
}