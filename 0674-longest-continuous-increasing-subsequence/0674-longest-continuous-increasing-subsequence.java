class Solution {
    public int findLengthOfLCIS(int[] arr) {
        int count=1;
            int k=1;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]) count++;
                else { count=1;}
                if(count>k) k=count;
            }
            return k;
    }
}