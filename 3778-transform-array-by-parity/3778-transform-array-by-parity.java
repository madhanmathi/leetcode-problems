class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
       for(int i=0;i<n;i++){
        if(nums[i]%2==0) nums[i]=0;
        else nums[i]=1;
       } 
       int s=0;
       int e=n-1;
       while(s<e){
        if(nums[s]==0){
            s++;
            continue;
        }
         if(nums[e]==1){
            e--;
            continue;
        }
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
       }
       return nums;
    }
}