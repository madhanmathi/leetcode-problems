class Solution {
    public boolean halvesAreAlike(String s) {
        int count=0;
        int max=0;
        String v="aeiouAEIOU";
        for(int i=0;i<s.length()/2;i++){
            if(v.contains(String.valueOf(s.charAt(i)))) count++;
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(v.contains(String.valueOf(s.charAt(i)))) max++;
        }
        if(max==count) return true;
        return false;
    }
}