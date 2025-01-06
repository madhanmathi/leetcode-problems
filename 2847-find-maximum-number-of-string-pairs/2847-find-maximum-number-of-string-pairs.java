class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set=new HashSet<>();
        int count=0;
        for(String word:words){
            String b=new StringBuilder(word).reverse().toString();
            if(set.contains(b)){
                count++;
            }
            set.add(word);
        }
        return count;
    }
}