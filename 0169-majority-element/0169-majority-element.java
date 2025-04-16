class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int val=0;
       int s=0;
       for(int n:map.keySet()){
        if(map.get(n)>val){
            val=map.get(n);
            s=n;
        }
       }
       return s;
    }
}