class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] arr=new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer> n:map.entrySet()){
            if(n.getValue()==1) arr[i++]=n.getKey();
        }
        return arr;
    }
}