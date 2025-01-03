class Solution {
    public boolean isBalanced(String num) {
        int a=0;
        int b=0;
       for(int i=0;i<num.length();i++){
        if(i%2==0) a=a+(num.charAt(i)-'0');
        else{
             b=b+(num.charAt(i)-'0') ;
       } 
       }
       if(a==b) return true;
       return false;
    }
}