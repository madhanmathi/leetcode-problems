class Solution {
    public int maximumCount(int[] arr) {
       int count=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                count++;
            }
            if(arr[i]<0){
                k++;
            }
        }
         if(count>k) return count;
        return k;  
    }
}