class Solution {
    public int countLargestGroup(int n) {
      int[] arr=new int[37];
        for(int i=1;i<=n;i++){
            int val=i;
            int sum=0;
            while(val!=0){
            sum=sum+val%10;
            val=val/10;
            }
          arr[sum]++;
        }
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        int count=0;
         for(int i=1;i<arr.length;i++){
            if(arr[i]==max) count++;
        }
        return count;
    }
}