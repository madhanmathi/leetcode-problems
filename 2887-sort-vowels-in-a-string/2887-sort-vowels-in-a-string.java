class Solution {
    public String sortVowels(String s) {
        String vowels="aeiouAEIOU";
        List<Character> list=new ArrayList<>();
            for(int i=0;i<s.length();i++){
             if(vowels.contains(String.valueOf(s.charAt(i)))) list.add(s.charAt(i));
        }
        Collections.sort(list);
        int k=0;
        StringBuilder b=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(vowels.contains(String.valueOf(s.charAt(i)))) b.append(list.get(k++));
            else{
                b.append(s.charAt(i));
            }
        }
        return b.toString();
    }
}