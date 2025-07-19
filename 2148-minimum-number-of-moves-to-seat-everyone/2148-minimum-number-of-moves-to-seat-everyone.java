class Solution {
    public int minMovesToSeat(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n=arr1.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.abs(arr1[i]-arr2[i]);
        }
        return sum;
    }
}