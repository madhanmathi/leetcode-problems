class Solution {
    public int[] plusOne(int[] digits) {
    return func(digits);    
    }
    static int[] func(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
             if(arr[i]+1!=10){
                arr[i]=arr[i]+1;
                return arr;
             }
             arr[i]=0;
             
        }
        int[] ans=new int[arr.length+1];
        ans[0]=1;
        return ans;
    }
}