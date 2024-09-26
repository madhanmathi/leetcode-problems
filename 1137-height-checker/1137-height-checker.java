class Solution {
    public int heightChecker(int[] arr) {
        int[] ans=new int[arr.length];
       int count=0;
       for(int i=0;i<arr.length;i++)ans[i]=arr[i];
       Arrays.sort(ans);
       for(int i=0;i<arr.length;i++)if(arr[i]!=ans[i]) count++;
       return count;
    }
}