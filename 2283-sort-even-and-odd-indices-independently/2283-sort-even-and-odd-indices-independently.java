class Solution {
    public int[] sortEvenOdd(int[] nums) {
        if(nums.length<=2) return nums;
        List<Integer> list1=new ArrayList<>();
         List<Integer> list2=new ArrayList<>();
         int[] ans=new int[nums.length];
         for(int i=0;i<nums.length;i++){
            if(i%2==0) list1.add(nums[i]);
            else list2.add(nums[i]);
         }
         Collections.sort(list1);
          Collections.sort(list2);
          Collections.reverse(list2);
          int j=0;
          int k=0;
          for(int i=0;i<ans.length;i++){
            if(i%2==0) ans[i]=list1.get(j++);
            else ans[i]=list2.get(k++);
          }
          return ans;
    }
}