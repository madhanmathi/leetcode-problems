class Solution {
    public int searchInsert(int[] nums, int target) {
       return func(nums,target); 
    }
    static int func(int[] arr,int target){
        int i;
        for ( i = 0; i < arr.length; i++) {
            if(arr[i]>=target){
                return i;
            }
        }
        return i;
    }
}