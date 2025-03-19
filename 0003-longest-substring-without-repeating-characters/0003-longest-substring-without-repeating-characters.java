class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0;
        int e=0;
        int max=0;
        HashSet<Character> set=new HashSet<>();
        while(e<s.length()){
            if(!set.contains(s.charAt(e))){
                set.add(s.charAt(e));
                e++;
                max=Math.max(max,set.size());
            }
            else{
                set.remove(Character.valueOf(s.charAt(st)));
                st++;
            }
        }
        return max;
    }
}