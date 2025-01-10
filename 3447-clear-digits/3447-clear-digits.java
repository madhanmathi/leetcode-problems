class Solution {
    public String clearDigits(String s) {
      Stack<Character> stack=new Stack<>();
      for(int i=0;i<s.length();i++){
        if(!stack.isEmpty() && s.charAt(i)>='0'&&s.charAt(i)<='9') stack.pop();
        else stack.push(s.charAt(i));
      }
       StringBuilder b=new StringBuilder();
        while(!stack.isEmpty()){
          b.append(stack.pop());
        }
        return b.reverse().toString();
    }
}