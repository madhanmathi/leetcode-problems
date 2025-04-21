class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       int[] arr=new int[k];
       int val=0;
       for(int i=0;i<k;i++){
        int max=Integer.MIN_VALUE;
        for(int n:map.keySet()){
          if(map.get(n)>max){
            max=map.get(n);
            val=n;
          }
        }
        arr[i]=val;
        map.put(val,0);
       }
     return arr;  
    }
}