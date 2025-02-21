class Solution {
    public boolean detectCapitalUse(String a) {
        int c3=0;
        if((a.toUpperCase()).equals(a)) return true;
        if((a.toLowerCase()).equals(a)) return true;
         if((a.charAt(0)>='A'&&a.charAt(0)<='Z'))
         {
          for(int i=1;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch>='a'&&ch<='z') c3++;
         }
       } 
       if(c3==a.length()-1) return true;
       return false;
    }
}