class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }
            else stack.push(c);
        }
        StringBuilder b=new StringBuilder();
        while(!stack.isEmpty()){
          b.append(stack.pop());
        }
        return b.reverse().toString();
    }
}