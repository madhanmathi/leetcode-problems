class Solution {
    public int[] shuffle(int[] nums, int n) {
        
   return func(nums,n); }
    static int[] func(int[] nums,int n){
        int idx=0;
        int[] array1=new int[n];
        int[] array2=new int[n];
        
             for(int i=0;i<n;i++){
             array1[i]=nums[i];
}
for(int j=n;j<nums.length;j++){
     array2[j-n]=nums[j];
    }
    for(int i=0;i<n;i++){
        nums[idx++]=array1[i];
        nums[idx++]=array2[i];

    }
    return nums;
}
}