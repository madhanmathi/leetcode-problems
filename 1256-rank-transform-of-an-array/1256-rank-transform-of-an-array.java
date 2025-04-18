class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
        int[] res=Arrays.copyOf(arr,arr.length);
       Arrays.sort(res);
       int j=1;
        for(int i=0;i<arr.length;i++){
          if(!set.contains(res[i])){
            map.put(res[i],j++);
            set.add(res[i]);
          }
        }
        int[] val=new int[arr.length];
        for(int i=0;i<arr.length;i++){
           val[i]=map.get(arr[i]);
        }
        return val;
    }
}