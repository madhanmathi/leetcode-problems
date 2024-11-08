class Solution {
    public String defangIPaddr(String arr) {
         String a="";
     for(int i=0;i<arr.length();i++){
           if(arr.charAt(i)=='.') a=a+"[.]";
           else a=a+arr.charAt(i);
        }
        return a;    
    }
}