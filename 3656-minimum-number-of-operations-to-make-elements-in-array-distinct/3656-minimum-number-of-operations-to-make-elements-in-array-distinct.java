class Solution {
    public int minimumOperations(int[] nums) {
        // int[] arr=new int[101];
        // int count=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=nums.length-1;i>=0;i--){
           if(!set.add(nums[i]))
           {
            return (i+3)/3;
           }
        }
        return 0;
    }
}