class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
                List<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            list.add(nums1[i]);
        }
        for(int j=0;j<n;j++){
            list.add(nums2[j]);
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            nums1[i]=list.get(i);
        }
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
    }
}