class Solution {
    public int findNonMinOrMax(int[] arr) {
       Arrays.sort(arr);
       if(arr.length-1<1) return -1;
        if(arr[1]<arr[arr.length-1]&&arr[1]>arr[0]) return arr[1];
        return -1; 
    }
}