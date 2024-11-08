class Solution {
    public int finalValueAfterOperations(String[] word) {
        int count=0;
        String a="-";
        for(int i=0;i<word.length;i++){
            if(word[i].contains(a)) count--;
            else count++;
        }
        return count;
    }
}