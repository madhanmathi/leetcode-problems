class Solution {
    public int findGCD(int[] arr) {
         Arrays.sort(arr);
        int min=arr[0];
        int max=arr[arr.length-1];
        int count=0;
        int k=0;
        for(int i=min;i>0;i--){
            if(min%i==0&&max%i==0){
                count=i;
            }
       if(count>k) k=count;
        }
        
        return k;
    }
}