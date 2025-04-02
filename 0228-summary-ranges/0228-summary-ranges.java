class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<String>();
      for(int i=0;i<nums.length;i++){
        int s=nums[i];
        boolean b=false;
        while(i<nums.length-1&&nums[i]+1==nums[i+1]){
            b=true;
            i++;
        }
        if(b) list.add(s+"->"+nums[i]);
        else list.add(String.valueOf(s));
      }
      return list;
    }
}