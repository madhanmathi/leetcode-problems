class Solution {
    public int maxArea(int[] arr) {
        int s=0;
        int e=arr.length-1;
        int max=0;
        while(s<e){
           int min=Math.min(arr[s],arr[e]);
            int val=Math.abs(s-e);
            max=Math.max(max,min*val);
            if(arr[s]<arr[e]) s++;
            else e--;
        }
      return max;
    }
}