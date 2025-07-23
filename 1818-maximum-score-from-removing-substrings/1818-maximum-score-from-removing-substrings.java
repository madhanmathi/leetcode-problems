class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> stack=new Stack<>();
        boolean flag=true;
        if(y>x) flag=false;
        int count=0;
        StringBuilder sb=new StringBuilder();
        if(!flag){
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
        if(stack.isEmpty()) stack.push(ch);
        else if(ch=='b'&&stack.peek()=='a'&&!stack.isEmpty()){
             count+=y;
             stack.pop();
        }
        else stack.push(ch);
        }
        }
        else{
         for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
        if(stack.isEmpty()) stack.push(ch);
        else if(ch=='a'&&stack.peek()=='b'&&!stack.isEmpty()){
             count+=x;
             stack.pop();
        }
        else stack.push(ch);
        }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        int val=sb.length()-1;
        if(!flag){
            for(int i=sb.length()-1;i>=0;i--){
                char ch=sb.charAt(i);
                 if(stack.isEmpty()) stack.push(ch);
        else if(ch=='a'&&stack.peek()=='b'&&!stack.isEmpty()){
             count+=x;
             stack.pop();
        }
        else stack.push(ch);
            }
        }
        else{
             for(int i=sb.length()-1;i>=0;i--){
                char ch=sb.charAt(i);
                 if(stack.isEmpty()) stack.push(ch);
        else if(ch=='b'&&stack.peek()=='a'&&!stack.isEmpty()){
             count+=y;
             stack.pop();
        }
        else stack.push(ch);
            }
        }
        return count;
    }
}