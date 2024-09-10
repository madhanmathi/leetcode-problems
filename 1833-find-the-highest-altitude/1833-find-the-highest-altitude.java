class Solution {
    public int largestAltitude(int[] arr) {
        
  int[] ans=new int[arr.length+1];
        
         int sum=0;
         int max=arr[0];
         for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
            ans[i+1]=sum;
        
         }
         for (int i = 0; i<ans.length; i++) {    
         if(ans[i]>max){
            max=ans[i];
        }
    }
         return max;
       
    }
}