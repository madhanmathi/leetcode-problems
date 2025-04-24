class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr=new int[1001];
        for(int i:arr1) arr[i]++;
        int[] res=new int[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++){
          for(int j=0;j<arr[arr2[i]];j++){
            res[k++]=arr2[i];
          }
          arr[arr2[i]]=0;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) continue;
             for(int j=0;j<arr[i];j++){
            res[k++]=i;
          }
        }
        return res;
    }
}