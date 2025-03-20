class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
          HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set1.add(nums2[i]);
        }
        List<Integer> l1=new ArrayList<>();
        for(int val:set){
            if(!set1.contains(val)) l1.add(val);
        }
        list.add(new ArrayList<>(l1));
         List<Integer> l2=new ArrayList<>();
        for(int val:set1){
            if(!set.contains(val)) l2.add(val);
        }
        list.add(new ArrayList<>(l2));
        return list;
    }
}