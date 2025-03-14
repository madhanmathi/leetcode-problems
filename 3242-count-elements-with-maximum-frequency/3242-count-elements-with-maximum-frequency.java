class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int count=0;
        int val=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>count) count=arr[i];
        }
        for(int i=1;i<arr.length;i++){
            if(count==arr[i]) val=val+arr[i];
        }
        return val;
    }
}