class Solution {
    public int repeatedNTimes(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        int k=0;
        int val=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]) count++;
            else count=1;
            if(count>k){
                 k=count;
                 val=arr[i];
            }
        }
        return val;
    }
}