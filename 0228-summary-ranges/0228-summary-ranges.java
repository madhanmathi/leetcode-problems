class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<String>();
      int len=nums.length;
      for(int i=0;i<len;i++){
        int s=nums[i];
        boolean b=false;
        while(i<len-1&&nums[i]+1==nums[i+1]){
            b=true;
            i++;
        }
        if(b) list.add(s+"->"+nums[i]);
        else list.add(String.valueOf(s));
      }
      return list;
    }
}