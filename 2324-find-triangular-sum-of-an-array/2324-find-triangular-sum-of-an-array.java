class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1) return nums[0];
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<nums.length-1;i++){
        list.add((nums[i]+nums[i+1])%10);
       } 
       if(nums.length==2) return list.get(0);
       while(list.size()!=1){
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<list.size()-1;i++){
            res.add((list.get(i)+list.get(i+1))%10);
        }
        list=res;
       }
       return list.get(0);
    }
}