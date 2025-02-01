class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1) return true;
        String a=s.toLowerCase();
        String b="";
        for(int i=0;i<s.length();i++){
            if(a.charAt(i)>=97&&a.charAt(i)<=122||a.charAt(i)>='0'&&a.charAt(i)<='9')
             b=b+String.valueOf(a.charAt(i));
        }
        StringBuilder sb=new StringBuilder(b);
        String c=sb.reverse().toString();
        if(b.equals(c)) return true;
          return false;
    }
}