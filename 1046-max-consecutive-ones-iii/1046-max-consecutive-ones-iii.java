class Solution {
    public int longestOnes(int[] nums, int k) {
        int res=0;
        int count=0;
        if(k==nums.length) return k;
        for(int i=0;i<nums.length-k;i++){
            count=0;
            int val=k;
            int j=i;
            while(val>=0){
              if(nums[j]==0) val--;
              if(val<0) break;
               count++;
               res=Math.max(res,count);
              if(j==nums.length-1) break;
                j++;
           
            }
            res=Math.max(res,count);
        }
        return res;
    }
}