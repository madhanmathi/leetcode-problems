class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length/2;
        int[] arr=new int[501];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int count=0;
       for(int i=1;i<arr.length;i++){
        if(arr[i]%2==0) count=count+arr[i]/2;
       }
       if(count==n) return true;
       return false;
    }
}