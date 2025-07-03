class Solution {
    public char kthCharacter(int k) {
         String a="a";
         for(int i=0;i<k;i++){
            String b="";
            int j=0;
            while(j<a.length()){
                if(a.charAt(j)>122)  b+=((char)(a.charAt(j++)-26)); 
               b+=((char)(a.charAt(j++)+1)); 
            }
            a+=b;
            if(a.length()>k) break;
         }
         if(k>a.length()) return a.charAt(0);
       return a.charAt(k-1);
    }
}