class Solution {
    public String reverseWords(String s) {
       String c="";
        String[] a=s.split(" ");
        for(int i=0;i<a.length;i++){
            StringBuilder b=new StringBuilder(a[i]);
            b.reverse().toString();
            c=c+" "+b;
        }
return c.trim(); 
    }
}