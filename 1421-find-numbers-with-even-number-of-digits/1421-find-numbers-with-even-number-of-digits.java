class Solution {
    public int findNumbers(int[] nums) {
        
   return func(nums); }
     static int func(int[] arr){
        int count=0;
        int res=0;
        for (int i = 0; i < arr.length; i++) {
           while(arr[i]>0){
            arr[i]=arr[i]/10;
            count++;
           }
           if(count%2==0){
            res++;
           }
           count=0;
        }
        return res;
    }
}