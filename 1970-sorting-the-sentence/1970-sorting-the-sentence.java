class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] sort=new String[words.length];
        for(String word:words){
            int pos=Integer.parseInt(word.replaceAll("\\D",""))-1;
            sort[pos]=word.replaceAll("\\d","");
        }
        String res=String.join(" ",sort);
        return res;
    }
}