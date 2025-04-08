class Solution {
    public int minimumOperations(int[] nums) {
        int[] arr=new int[101];
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            arr[nums[i]]++;
            if(arr[nums[i]]==1){
                continue;
            }
            else{
                count=(i+1)/3;
                if((i+1)%3!=0) count++;
                break;
            }
        }
        return count;
    }
}