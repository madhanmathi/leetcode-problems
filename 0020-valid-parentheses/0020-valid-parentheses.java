class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack=new Stack<>();
     HashMap<Character,Character> map=new HashMap<>();
     map.put(')','('); 
     map.put(']','[');   
     map.put('}','{');     
     if(s.length()<=1) return false;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') stack.push(s.charAt(i));
        else if(stack.isEmpty() || map.get(s.charAt(i))!=stack.peek()) return false;
        else{
            stack.pop();
        }
     }  
     if(stack.isEmpty()) return true;
     return false; 
    }
}