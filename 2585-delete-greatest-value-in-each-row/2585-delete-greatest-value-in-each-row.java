class Solution {
    public int deleteGreatestValue(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            Arrays.sort(arr[i]);
        }
        int r=arr[0].length-1;
        int val=arr[0].length;
        int count=0;
        int sum=0;
        for(int j=0;j<arr[0].length;j++){
            count=0;
        for(int i=0;i<n;i++){
          count=Math.max(count,arr[i][r]);
        }
        sum=sum+count;
        r--;
        }
        return sum;
    }
}