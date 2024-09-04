class Solution {
    public boolean checkIfPangram(String sentence) {
         String ans="abcdefghijklmnopqrstuvwxyz";

        for(int i=0;i<=ans.length()-1;i++){
        String temp=String.valueOf(ans.charAt(i));
        if(!sentence.contains(temp)){
            return false;
        }
     }
    return true;
    
}
}