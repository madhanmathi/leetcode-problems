class Solution {
    public int[] getSneakyNumbers(int[] arr) {
        int[] ans=new int[2];
       int k=0;
       int[] freq=new int[100];
       for(int i=0;i<arr.length;i++){
        freq[arr[i]]++;
       }
       for(int i=0;i<100;i++){
        if(freq[i]==2) ans[k++]=i;
       }
        return ans;
    }
}