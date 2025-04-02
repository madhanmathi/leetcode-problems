class Solution {
    public String decodeMessage(String key, String message) {
        LinkedHashSet<Character> list = new LinkedHashSet<>();
      for(int i=0;i<key.length();i++){
        if(key.charAt(i)!=' '){
            list.add(key.charAt(i));
        }
      }
     StringBuilder b=new StringBuilder();
     for(int i=0;i<message.length();i++){
        if(message.charAt(i)==' '){
            b.append(' ');
            continue;
        }
        int j=0;
        for(char c:list){
            if(message.charAt(i)==c) b.append((char)((j++)+97));
            j++;
        }
     }
     return b.toString();
    }
}