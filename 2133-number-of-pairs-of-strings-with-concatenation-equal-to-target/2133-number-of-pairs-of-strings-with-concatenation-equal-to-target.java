class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            String a="";
            for(int j=0;j<nums.length;j++){
              a=nums[i]+nums[j];
              if(a.equals(target)&&i!=j) count++;
            }
        }
        return count;
    }
}