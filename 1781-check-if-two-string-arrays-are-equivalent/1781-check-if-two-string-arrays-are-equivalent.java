class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
  return func(word1,word2);      
    }
     static boolean func(String[] s1,String[] s2){
             String a1="";
             String a2="";
             for(int i=0;i<s1.length;i++){
               a1= a1.concat(s1[i]);
             }
             for(int i=0;i<s2.length;i++){
               a2= a2.concat(s2[i]);
             }
             if(a1.equals(a2)){
                return true;
             }
             return false;
    }
}