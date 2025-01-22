class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=words.length;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(!allowed.contains(String.valueOf(words[i].charAt(j)))){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}