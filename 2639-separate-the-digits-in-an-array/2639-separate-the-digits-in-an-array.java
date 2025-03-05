class Solution {
    public int[] separateDigits(int[] arr) {
        int n=arr.length;
        List<Integer> list=new ArrayList<>();
      String a="";
      for(int i=0;i<n;i++){
        a=a+String.valueOf(arr[i]);
      }
      for(int i=0;i<a.length();i++){
        int val=Integer.valueOf(a.charAt(i)-'0');
        list.add(val);
      }
        int[] nums=new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}