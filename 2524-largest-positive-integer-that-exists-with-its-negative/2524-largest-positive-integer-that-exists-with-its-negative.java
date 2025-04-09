class Solution {
    public int findMaxK(int[] nums) {
        int[] arr1=new int[1001];
        int[] arr2=new int[1001];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) arr1[nums[i]]++;
            else arr2[Math.abs(nums[i])]++;
        }
        int count=0;
        for(int i=1;i<arr1.length;i++){
         if(arr1[i]>0&&arr2[i]>0) count=i;
        }
        if(count==0) return -1;
        return count;
    }
}