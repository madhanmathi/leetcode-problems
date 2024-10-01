class Solution {
    public int singleNumber(int[] arr) {
         Arrays.sort(arr);
        int k=0;
        for(int i:arr){
              k=k^i;  
        }
       return k; 
    }
}