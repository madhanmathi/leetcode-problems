class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list=new ArrayList<>();
          int[] arr1=new int[101];
           int[] arr2=new int[101];
            int[] arr3=new int[101];
        for(int i=0;i<nums1.length;i++){
            arr1[nums1[i]]=1;
        }
         for(int i=0;i<nums2.length;i++){
            arr2[nums2[i]]=1;
        }
         for(int i=0;i<nums3.length;i++){
             arr3[nums3[i]]=1;
        }
        for(int i=1;i<101;i++){
            if(arr1[i]+arr2[i]+arr3[i]>1) list.add(i);
        }
        return list;
    }
}