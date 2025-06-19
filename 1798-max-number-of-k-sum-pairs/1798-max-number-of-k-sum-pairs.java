class Solution {
    public int maxOperations(int[] arr, int k) {
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        int count=0;
     while(l<r){
        int val=arr[l]+arr[r];
        if(val==k){
            count++;
            l++;
            r--;
        }
        else if(val>k) r--;
        else l++;
     }
     return count;
    }
}