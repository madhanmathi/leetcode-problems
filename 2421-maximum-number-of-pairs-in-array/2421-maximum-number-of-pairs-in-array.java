class Solution {
    public int[] numberOfPairs(int[] nums) {
         int[] arr=new int[2];
      int[] res=new int[101];
      for(int i:nums) res[i]++;
      int count=0;
      int val=0;
      for(int i=0;i<res.length;i++){
        if(res[i]%2==0) count=count+res[i]/2;
        else{
            count=count+res[i]/2;
            val=val+res[i]%2;
        }
      }
      arr[0]=count;
      arr[1]=val;
      return arr;
    }
}