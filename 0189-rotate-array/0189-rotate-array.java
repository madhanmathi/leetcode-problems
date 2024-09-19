class Solution {
    public void rotate(int[] arr, int k) {
        int[] ans=new int[arr.length];
             for(int i=0;i<arr.length;i++){
                ans[k%arr.length]=arr[i];
                k++;
             }
            for(int i = 0;i < ans.length;i++) arr[i] = ans[i];
    }
}