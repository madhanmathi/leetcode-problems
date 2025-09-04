class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        Stack<Integer> stack=new Stack<>();
        int i=1;
        int[] res=new int[n];
        stack.push(0);
        while(i<n){
            while( !stack.isEmpty() && arr[i] > arr[ stack.peek() ] ){
                 res[stack.peek()]=i-stack.pop(); 
            }
            stack.push(i);
            i++;
        }  
        return res;
    }
}