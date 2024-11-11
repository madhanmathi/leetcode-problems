class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int k=0;
    int[] ans=new int[nums1.length+nums2.length];
    for(int i=0;i<nums1.length;i++){
        ans[k++]=nums1[i];
    }
    for(int i=0;i<nums2.length;i++){
        ans[k++]=nums2[i];
    }
    Arrays.sort(ans);
    if(ans.length%2==0) return (double)(ans[ans.length/2]+ans[(ans.length/2)-1])/2; 
    else return (double)ans[ans.length/2];
    }
}