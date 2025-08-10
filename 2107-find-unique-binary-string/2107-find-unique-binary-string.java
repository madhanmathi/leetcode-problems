class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
        }
        StringBuilder sb=new StringBuilder(nums[0]);
        for(int i=0;i<sb.length();i++){
           if(sb.charAt(i)=='1') sb.setCharAt(i,'0');
           else sb.setCharAt(i,'1');
            if(!set.contains(sb.toString())) return sb.toString();
        }
        return "";
    }
}