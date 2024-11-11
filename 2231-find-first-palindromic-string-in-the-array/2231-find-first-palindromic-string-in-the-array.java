class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(words[i].charAt(0)!=words[i].charAt(words[i].length()-1)) continue;
            StringBuilder sb=new StringBuilder(words[i]);
            sb.reverse();
            if(words[i].equals(sb.toString())) return words[i];
        }
        return "";
    }
}