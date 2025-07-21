class Solution {
    public int[][] diagonalSort(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int val=n;
        while(val!=0){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-1;j++){
        if(arr[i][j]>arr[i+1][j+1]){
            int temp=arr[i][j];
            arr[i][j]=arr[i+1][j+1];
            arr[i+1][j+1]=temp;
        }
            }
        }
        val--;
        }
        return arr;
    }
}