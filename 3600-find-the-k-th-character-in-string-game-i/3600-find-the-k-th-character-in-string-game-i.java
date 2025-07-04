class Solution {
    public char kthCharacter(int k) {
         StringBuilder a=new StringBuilder();
         a.append("a");
         for(int i=0;i<k;i++){
            StringBuilder b=new StringBuilder();
            int j=0;
            while(j<a.length()){
         if(a.charAt(j)>122) b.append(((char)(a.charAt(j++)-26))); 
               b.append(((char)(a.charAt(j++)+1))); 
            }
            a.append(b);
            if(a.length()>k) break;
         }
       return a.charAt(k-1);
    }
}