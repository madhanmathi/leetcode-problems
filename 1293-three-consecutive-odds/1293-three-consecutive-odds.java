class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        int k=3;
             for(int i=0;i<arr.length;i++){
                if(arr[i]%2!=0)count++;
                 else count=0;
                if(count==k) return true;
             }
             return false;
    }
}