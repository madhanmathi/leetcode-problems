class Solution {
    public boolean isLongPressedName(String a, String b) {
        int s=a.length()-1;
        int e=b.length()-1;
        int count=0;
          if(a.charAt(0)!=b.charAt(0)) return false;
        if(a.charAt(s)!=b.charAt(e)) return false;
        while(s>=0&&e>=0){
            if(a.charAt(s)==b.charAt(e)){
                count++;
                s--;
                e--;
            }
           else  if(a.charAt(s+1)!=b.charAt(e)) return false;
            else e--;
        }
        if(count==a.length()) return true;
        return false;
    }
}