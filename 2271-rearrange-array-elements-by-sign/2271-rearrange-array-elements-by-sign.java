class Solution {
    public int[] rearrangeArray(int[] arr) {
         int index=0;
        int val=1;
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                ans[index]=arr[i];
                index=index+2;
            }
            else{
                ans[val]=arr[i];
                val=val+2;
            }
        }
        return ans;
    }
}