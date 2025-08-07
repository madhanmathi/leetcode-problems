class Solution {
    public int removeDuplicates(int[] nums) {
       Map<Integer,Integer> map=new LinkedHashMap<>();
       Set<Integer> set=new LinkedHashSet<>();
       for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
        set.add(i);
       } 
       int k=0;
       int count=0;
       for(int i:set){
        if(map.get(i)>=2){
            nums[k++]=i;
            nums[k++]=i;
            count+=2;
        }
        else{
             nums[k++]=i;
             count++;
        }
       }
       return count;
    }
}