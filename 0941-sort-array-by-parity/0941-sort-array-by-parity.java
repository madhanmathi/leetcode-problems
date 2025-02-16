class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length<=1) return nums;
        int[] ans=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
         if(nums[i]%2==0) list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
         if(nums[i]%2!=0) list.add(nums[i]);
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}