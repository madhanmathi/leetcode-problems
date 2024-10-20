class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
         int count=0;
        int k=0;
    for (int i=0; i<arr.length;i++)
   {
    if(arr[i]==1){
        count++;
    }
   else {
      count=0;
    }
    if(count>k) k=count;
   }
   return k;
    }
}