class Solution {
    public int maximumLength(int[] nums) {
      int c1=0;
      int c2=0;
      int n=nums.length;
      List<Integer> list=new ArrayList<>();
      for(int i=0;i<n;i++){
      if(nums[i]%2==0) c1++;
      else c2++;
      }  
      list.add(nums[0]);
      for(int i=1;i<n;i++){
      if(list.get(list.size()-1)%2==0&&nums[i]%2!=0) list.add(nums[i]);
      else if(list.get(list.size()-1)%2!=0&&nums[i]%2==0) list.add(nums[i]);
      }
      return Math.max(Math.max(c1,c2),list.size());
    }
}