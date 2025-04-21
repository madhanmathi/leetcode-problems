class Solution {
    public int minSteps(String s, String t) {
      Map<Character,Integer> map1=new HashMap<>();
      Map<Character,Integer> map2=new HashMap<>();
      for(char i:s.toCharArray()){
        map1.put(i,map1.getOrDefault(i,0)+1);
      }
       for(char i:t.toCharArray()){
        map2.put(i,map2.getOrDefault(i,0)+1);
      }
      int count=0;
      int val=0;
      for(char i:map1.keySet()){
    if(map2.containsKey(i)&&map1.get(i)>map2.get(i)) count=count+(map1.get(i)-map2.get(i));
        if(!map2.containsKey(i)) val=val+map1.get(i);
      }
      return count+val;
    }
}