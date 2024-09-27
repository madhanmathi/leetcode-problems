class Solution {
    public int dominantIndex(int[] arr) {
        int k=0;
    int max=arr[0];
    int max2=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
            k=i;
        }
    }
    if(arr[0]!=max)
            max2=arr[0];
        else
            max2=arr[1];
    for(int i=0;i<arr.length;i++)if(arr[i]>max2&&arr[i]<max) max2=arr[i];
    if(max2*2<=max) return k;
    return -1;
    }
}