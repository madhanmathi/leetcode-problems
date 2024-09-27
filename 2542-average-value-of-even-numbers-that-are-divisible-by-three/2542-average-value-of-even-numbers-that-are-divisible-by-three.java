class Solution {
    public int averageValue(int[] arr) {
      int count=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0&&arr[i]%3==0){
                c=c+arr[i];
                count++;
            }
        }
       if(count!=0){
        return c/count;
       }
       return 0;  
    }
}