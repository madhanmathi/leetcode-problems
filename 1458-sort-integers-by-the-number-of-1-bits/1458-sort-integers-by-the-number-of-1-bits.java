class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        TreeMap<Integer,Integer> map=new TreeMap<>();
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            int val=Integer.bitCount(arr[i]);
            set.add(val);
          if(!map.containsKey(arr[i]))  map.put(arr[i],val);
        }
        int k=0;
        int[] res=new int[arr.length];
       for(int i:set){
        for(int n:arr){
           if(map.get(n)==i) res[k++]=n;
        }
       }
        return res;
    }
}