class Solution {
    public int maxDifference(String s) {
       int[] arr=new int[26];
       for(char ch:s.toCharArray()) arr[ch-97]++;
       int max1=Integer.MAX_VALUE;
       int max2=Integer.MIN_VALUE;
      for(int i=0;i<26;i++){
        if(arr[i]%2==0&&arr[i]!=0) max1=Integer.min(max1,arr[i]);
      }
       for(int i=0;i<26;i++){
        if(arr[i]%2!=0&&arr[i]!=0) max2=Integer.max(max2,arr[i]);
      }
        return max2-max1;
    }
}