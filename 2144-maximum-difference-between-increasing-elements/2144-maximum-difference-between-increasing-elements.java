class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
        boolean flag=true;
        for(int i=0;i<nums.length-1;i++){
    for(int j=i+1;j<nums.length;j++){
        if(nums[i]<nums[j]){
            max=Math.max(max,(nums[j]-nums[i]));
            flag=false;
    }
        }
    }
    if(flag) return -1;
    return max;
}
}