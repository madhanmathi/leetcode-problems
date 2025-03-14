class Solution {
    public int countPoints(String s) {
        int count=0;
       for(int i=0;i<10;i++){
         String a="";
        for(int j=1;j<s.length();j+=2){
            char ch=s.charAt(j-1);
            char ch2=s.charAt(j);
           if((!a.contains(String.valueOf(ch)))&&(ch2-'0')==i)  a=a+ch;
        }
        if(a.length()==3) count++;
       }
       return count;
    }
}