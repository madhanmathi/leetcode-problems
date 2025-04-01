class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
              int n1=0;
              int n2=0;
            int[] res=new int[m+n];
            int idx=0;
            while(n1<m&&n2<n){
                if(nums1[n1]<nums2[n2]) res[idx++]=nums1[n1++];
                else if(nums1[n1]>nums2[n2]) res[idx++]=nums2[n2++];
                else{
                    res[idx++]=nums1[n1++];
                      res[idx++]=nums2[n2++]; 
                }
            }
            while(n1<m) res[idx++]=nums1[n1++];
             while(n2<n) res[idx++]=nums2[n2++];
             for(int i=0;i<res.length;i++) nums1[i]=res[i];
    }
}