class Solution {
    public int longestPalindrome(String s) {
    Map<Character,Integer> map=new HashMap<>();
    for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
    } int count=0;
       boolean flag=false;
      for(int num:map.values()){
        if(num%2==0) count=count+num;
        else{
            flag=true;
            count=count+(num-1);
        }
      }
      if(flag) return count+1;
      return count;
    }
}