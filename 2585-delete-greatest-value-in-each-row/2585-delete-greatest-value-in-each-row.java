class Solution {
    public int deleteGreatestValue(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            Arrays.sort(arr[i]);
        }
        int r=arr[0].length-1;
        int val=arr[0].length;
        int count=0;
        int sum=0;
        while(val>0){
            count=0;
        for(int i=0;i<n;i++){
            if(arr[i][r]>count){
                count=arr[i][r];
            }
        }
        System.out.print(count+" ");
        sum=sum+count;
        r--;
        val--;
        }
        return sum;
    }
}