class Solution {
    public int scoreOfString(String s) {
         int ans=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)!=s.charAt(i+1)){
              ans=ans+Math.abs(s.charAt(i)-s.charAt(i+1));
            }
        }
        return ans;
    }
}