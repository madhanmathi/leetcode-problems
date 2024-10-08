class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int i;
        int j=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=j){
              return i;
            }
            j++;
        }
        return i;
    }
}