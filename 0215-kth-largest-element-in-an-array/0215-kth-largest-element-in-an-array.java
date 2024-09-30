class Solution {
    public int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        int ans=arr[arr.length-k];
        return ans;
    }
}