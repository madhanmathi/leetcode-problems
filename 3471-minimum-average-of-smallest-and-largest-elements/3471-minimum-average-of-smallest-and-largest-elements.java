class Solution {
    public double minimumAverage(int[] arr) {
         Arrays.sort(arr);
          double[] ans=new double[arr.length/2];
          for(int i=0;i<arr.length/2;i++){
           ans[i]=(double)(arr[i]+arr[arr.length-1-i])/2;
          }
            Arrays.sort(ans);
            return ans[0];
    }
}