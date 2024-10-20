class Solution {
    public int maxProduct(int[] arr) {
         Arrays.sort(arr);
        int sum=(arr[arr.length-1]-1)*(arr[arr.length-2]-1);
       return sum;
    }
}