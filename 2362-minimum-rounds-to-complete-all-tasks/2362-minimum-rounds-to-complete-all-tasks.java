class Solution {
    public int minimumRounds(int[] arr) {
      HashMap<Integer,Integer> map=new HashMap<>();
      HashSet<Integer> list=new HashSet<>();
      for(int num:arr){
        list.add(num);
      map.put(num,map.getOrDefault(num, 0) + 1);
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
