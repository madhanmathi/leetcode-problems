class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n= nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n-1;i+=2){
            for(int j=0;j<nums[i];j++){
                list.add(nums[i+1]);
            }
        }
        int[] arr=new int[list.size()];
        int val=arr.length;
        for(int i=0;i<val;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}