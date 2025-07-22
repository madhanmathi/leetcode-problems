class Solution {
    public int[] countBits(int n) {
        String[] arr=new String[n+1];
        int[] res=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=Integer.toBinaryString(i);
            arr[i]=arr[i].replace("0","");
            res[i]=arr[i].length();
        }
        return res;
    }
}