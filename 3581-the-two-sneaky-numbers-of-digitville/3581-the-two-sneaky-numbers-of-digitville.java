class Solution {
    public int[] getSneakyNumbers(int[] arr) {
         Arrays.sort(arr);
        int[] ans=new int[2];
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
               ans[k]=arr[i];
               k++;
            }
        }
        return ans;
    }
}