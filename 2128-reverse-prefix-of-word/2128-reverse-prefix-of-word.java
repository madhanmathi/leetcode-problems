class Solution {
    public String reversePrefix(String s, char c) {
        String a="";
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) {
                k=i;
                break;
            }
        }
        StringBuilder sb=new StringBuilder(s.substring(0,k+1));
        sb.reverse();
        String ans=sb.toString();
        for(int i=k+1;i<s.length();i++){
            ans=ans+s.charAt(i);
        }
        return ans;
    }
}

