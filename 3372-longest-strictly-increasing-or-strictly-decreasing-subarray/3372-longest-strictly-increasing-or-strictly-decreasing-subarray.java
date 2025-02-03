class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int count=1;
        int count2=1;
        int k=1;
        int k2=1;
  
        for(int i=0;i<arr.length-1;i++){
           if(arr[i]<arr[i+1]) k++;
           else if(arr[i+1]<=arr[i]) {
             if(k>=count){
                count=k;
                k=1;
            }
            else k=1;
           }
           if(arr[i+1]<arr[i]) k2++;
            else if(arr[i+1]>=arr[i]) {
                if(k2>=count2){
                count2=k2;
                k2=1;
            }
            else k2=1;
            }
        }
       
        return Math.max(Math.max(k,k2),Math.max(count,count2));
    }
}