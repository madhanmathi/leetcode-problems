class Solution {
    public int repeatedNTimes(int[] arr) {
      HashSet<Integer> set=new HashSet<>();
      int n=arr.length;
      for(int i=0;i<n;i++){
        if(set.contains(arr[i])) return arr[i];
        set.add(arr[i]);
      }
      return -1;
    }
}