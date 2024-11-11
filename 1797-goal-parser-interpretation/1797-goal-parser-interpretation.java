class Solution {
    public String interpret(String command) {
         String a="";
          for(int i=0;i<command.length();i++){
            if(Character.isAlphabetic(command.charAt(i))) a=a+command.charAt(i);
            if(command.charAt(i)=='(' && command.charAt(i+1)==')') a=a+"o";
          } 
            return a;
    }
}