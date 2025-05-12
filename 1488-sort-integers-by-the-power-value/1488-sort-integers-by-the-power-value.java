class Solution {
    public int getKth(int lo, int hi, int k) {
        int[] arr=new int[1001];
        int[] res=new int[hi-lo+1];
        int val=0;
        for(int i=lo;i<=hi;i++){
            int ch=i;
            int count=0;
            while(ch>1){
                if(ch%2==0){
                 ch=ch/2;
                 count++;
                }
                else{
                    ch=3*ch+1;
                    count++;
                }
            }
           arr[i]=count;
           res[val++]=count;
        }
    Arrays.sort(res);
      int ans=res[k-1];
  int count=0;
  for(int i=k-1;i>=0;i--) if(res[i]==ans) count++;
for(int i=lo;i<=hi;i++){
    if(arr[i]==ans) count--;
    if(count==0) return i;
}
return 1;
    }
}