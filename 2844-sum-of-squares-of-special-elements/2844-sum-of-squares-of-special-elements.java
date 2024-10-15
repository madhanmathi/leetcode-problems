class Solution {
    public int sumOfSquares(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr.length%(i+1)==0){
          sum=arr[i]*arr[i]+sum;
            }
        }
        return sum;
    }
}