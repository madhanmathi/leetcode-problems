class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
           StringBuilder b=new StringBuilder();
              b.append(nums[i]);
              b.append(nums[j]);
              if(b.toString().equals(target)&&i!=j) count++;
            }
        }
        return count;
    }
}