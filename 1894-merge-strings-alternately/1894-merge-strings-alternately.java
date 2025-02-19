class Solution {
    public String mergeAlternately(String word1, String word2) {
        String b="";
        int j=0;
        int k=0;
        int max=Math.max(word1.length(),word2.length());
        for(int i=0;i<max;i++){
        if(j<word1.length()) b=b+word1.charAt(j++);
        if(k<word2.length()) b=b+word2.charAt(k++);
        }
      return b;
    }
}