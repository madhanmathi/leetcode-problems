class Solution {
    public int countHillValley(int[] nums) {
      List<Integer> list=new ArrayList<>();
      for(int i=0;i<nums.length-1;i++){
        if(nums[i]!=nums[i+1]) list.add(nums[i]);
      }  
      list.add(nums[nums.length-1]);
      int count=0;
      for(int i=1;i<list.size()-1;i++){
        int val1=list.get(i);
        int val2=list.get(i+1);
        int val3=list.get(i-1);
        if((val1<val2&&val1<val3)||(val1>val2&&val1>val3)) count++;
      }
      return count;
    }
}