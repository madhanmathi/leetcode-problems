class Solution {
    public int pivotInteger(int n) {
        int sum=0;
        int val=0;
        for(int i=1;i<=n;i++){
         sum=sum+i;
         for(int j=i;j<=n;j++){
            val=val+j;
         }
         if(val==sum) return i;
         else val=0;
        }
        return -1;
    }
}