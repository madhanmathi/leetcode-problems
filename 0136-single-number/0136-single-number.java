class Solution {
    public int singleNumber(int[] arr) {
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            map.add(arr[i]);
        }
        Integer[] ans=map.toArray(new Integer[map.size()]);
        int count=0;
        for(int i=0;i<ans.length;i++){
             for(int j=0;j<arr.length;j++){
                if(ans[i]==arr[j]) count++;
             }
             if(count==1) return ans[i];
             count=0;
        }
   return -1;
    }
}