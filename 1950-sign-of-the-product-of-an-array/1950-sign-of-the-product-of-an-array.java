class Solution {
    public int arraySign(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return 0;
            }
            else if(arr[i]<0){
                count++;
            }
        }
        if(count%2==0) return 1;
        return -1;
    }
}