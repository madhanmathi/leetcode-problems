class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
         for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
         for(int i=0;i<nums3.length;i++){
            set3.add(nums3[i]);
        }
        int[] arr=new int[101];
        for(int i:set1){
            arr[i]++;
        }
         for(int i:set2){
            arr[i]++;
        }
         for(int i:set3){
            arr[i]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=2) list.add(i);
        }
        return list;
    }
}