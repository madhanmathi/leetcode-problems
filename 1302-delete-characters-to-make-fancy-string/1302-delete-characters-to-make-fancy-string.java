class Solution {
    public String makeFancyString(String s) {
       StringBuilder sb=new StringBuilder();
       int n=s.length();
       int count=1;
       for(int i=0;i<n-1;i++){
        char ch1=s.charAt(i);
         char ch2=s.charAt(i+1);
         if(ch1==ch2) count++;
         else{
            if(count>=3){
                 sb.append(String.valueOf(ch1).repeat(2));
                 count=1;
            }
            else{
                sb.append(String.valueOf(ch1).repeat(count));
                count=1;
            }
         }
       }
       if(count>=3) sb.append(String.valueOf(s.charAt(n-1)).repeat(2));
       else  sb.append(String.valueOf(s.charAt(n-1)).repeat(count));
       return sb.toString();
    }
}