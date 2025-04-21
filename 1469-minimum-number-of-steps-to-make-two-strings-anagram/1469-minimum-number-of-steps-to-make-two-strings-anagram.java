class Solution {
    public int minSteps(String s, String t) {
      Map<String,Integer> map1=new HashMap<>();
      Map<String,Integer> map2=new HashMap<>();
      String[] arr1=s.split("");
      String[] arr2=t.split("");
      for(String i:arr1){
        map1.put(i,map1.getOrDefault(i,0)+1);
      }
       for(String i:arr2){
        map2.put(i,map2.getOrDefault(i,0)+1);
      }
      int count=0;
      int val=0;
      for(String i:map1.keySet()){
        if((map2.keySet()).contains(i)&&map1.get(i)>map2.get(i)){
            count=count+(map1.get(i)-map2.get(i));
        }
        if(!(map2.keySet()).contains(i)) val=val+map1.get(i);
      }
      return count+val;
    }
}