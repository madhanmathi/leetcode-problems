class Solution {
    public int calPoints(String[] arr) {
        Stack<String> stack=new Stack<>();
        int prev=0;
        String a="+CD";
    for(int i=0;i<arr.length;i++){
        if(stack.isEmpty()&&!a.contains(arr[i])) stack.push(arr[i]);
        else if(arr[i].equals("C")&&!stack.isEmpty()){
            prev=Integer.valueOf(stack.peek());
            stack.pop();
        }
        else if(arr[i].equals("D")&&!stack.isEmpty()){
            int val=2*Integer.valueOf(stack.peek());
            String b=String.valueOf(val);
            stack.push(b);
        }
        else if(arr[i].equals("+")&&!stack.isEmpty()){
            int val=Integer.valueOf(stack.peek());
            stack.pop();
            int res=val+Integer.valueOf(stack.peek());
            stack.push(String.valueOf(val));
            stack.push(String.valueOf(res));
        }
        else stack.push(arr[i]);
    }
    int sum=0;
    while(!stack.isEmpty()){
        sum+=Integer.valueOf(stack.peek());
        stack.pop();
    }
    return sum;
    }
}