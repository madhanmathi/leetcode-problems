class Solution {
    public String truncateSentence(String s, int k) {
         String[] b=s.split(" ");
        String a="";
        for(int i=0;i<k;i++){
            a=a+" "+b[i];
        }
        return a.trim();
    }
}