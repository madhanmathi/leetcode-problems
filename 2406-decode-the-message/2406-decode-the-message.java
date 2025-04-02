class Solution {
    public String decodeMessage(String key, String message) {
       List<Character> list=new ArrayList<>();
      for(int i=0;i<key.length();i++){
        if(key.charAt(i)!=' '&&!list.contains(key.charAt(i))){
            list.add(key.charAt(i));
        }
      }
     StringBuilder b=new StringBuilder();
     for(int i=0;i<message.length();i++){
        if(message.charAt(i)==' '){
            b.append(' ');
            continue;
        }
        for(int j=0;j<list.size();j++){
            if(message.charAt(i)==list.get(j)) b.append((char)(j+97));
        }
     }
     return b.toString();
    }
}