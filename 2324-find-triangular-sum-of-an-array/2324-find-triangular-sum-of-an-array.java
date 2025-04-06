class Solution {
    public int triangularSum(int[] nums) {
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        list.add(nums[i]);
       } 
       while(list.size()>1){
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<list.size()-1;i++){
            res.add((list.get(i)+list.get(i+1))%10);
        }
        list=res;
       }
       return list.get(0);
    }
}