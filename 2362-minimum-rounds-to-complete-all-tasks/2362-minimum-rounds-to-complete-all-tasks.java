class Solution {
    public int minimumRounds(int[] arr) {
      HashMap<Integer,Integer> map=new HashMap<>();
      HashSet<Integer> list=new HashSet<>();
      for(int i=0;i<arr.length;i++){
        list.add(arr[i]);
      if(!map.containsKey(arr[i])) map.put(arr[i],1);
      else map.put(arr[i],map.get(arr[i])+1);
      }  
      int count=0;
      for(int i:list){
        if(map.get(i)<2) return -1;
        if(map.get(i)%3==0) count=count+map.get(i)/3;
        else{
           count=count+((map.get(i)/3)+1);
        } 
      }
      return count;
    }
}