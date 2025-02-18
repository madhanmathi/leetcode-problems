class Solution {
    public String makeGood(String s) {
        StringBuilder b=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            int l=b.length();
            if(l==0) b.append(s.charAt(i));
            else{
               char ch=b.charAt(l-1);
               if(Math.abs(s.charAt(i)-ch)==32) b.deleteCharAt(l-1);
               else b.append(s.charAt(i));
            }
        }
   return b.toString();
    }
}