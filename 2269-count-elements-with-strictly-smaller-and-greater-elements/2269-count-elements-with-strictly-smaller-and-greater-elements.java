class Solution {
    public int countElements(int[] arr) {
     int count=0;
     int n=arr.length;
     for(int i=0;i<n;i++){
        int c1=0;
        int c2=0;
        for(int j=0;j<n;j++){
            if(arr[i]>arr[j]) c1=1;
            if(arr[i]<arr[j]) c2=1;
        }
        if(c1==1&&c2==1) count++;
     }   
     return count;
    }
}