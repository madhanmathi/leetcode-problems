class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
        for(char ch:s.toCharArray()) set1.add(ch);
        for(char ch:t.toCharArray()) set2.add(ch);
        if(set1.size()!=set2.size()) return false;
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)!=t.charAt(i)) return false;
            }
            else map.put(ch,t.charAt(i));
        }
        return true;
    }
}