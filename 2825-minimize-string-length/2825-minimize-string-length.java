class Solution {
    public int minimizedStringLength(String s) {
        int count=0;
        String[] str=s.split("");
        Arrays.sort(str);
        Stack<String> stack=new Stack<>();
        for(String c:str){
            if(!stack.isEmpty() && stack.peek().equals(c)){
                stack.pop();
                stack.push(c);
            }
            else {
                stack.push(c);
            }
        }
             while(!stack.isEmpty()){
          stack.pop();
          count++;
        }
        return count;
    }
}