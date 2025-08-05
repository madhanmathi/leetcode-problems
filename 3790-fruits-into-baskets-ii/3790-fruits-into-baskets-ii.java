class Solution {
    public int numOfUnplacedFruits(int[] arr1, int[] arr2) {
        int s=0;
        int e=0;
        int n=arr1.length;
        int count=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr1[i]<=arr2[j]){
                count++;
                arr2[j]=0;
                break;
            }
        }
       }
       return n-count;
    }
}