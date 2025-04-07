class Solution {
    public boolean containsDuplicate(int[] arr) {
        int n=arr.length;
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<n;i++){
        set.add(arr[i]);
      }
      if(set.size()==n) return false;
      return true;
    }
}