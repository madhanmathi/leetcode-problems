class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] num1, int[][] num2) {
       List<List<Integer>> res=new ArrayList<>(); 
          HashMap<Integer,Integer> map=new HashMap<>();
          int min1=Integer.MAX_VALUE;
          int max1=Integer.MIN_VALUE;
          for(int i=0;i<num1.length;i++){
            map.put(num1[i][0],num1[i][1]);
            min1=Math.min(min1,num1[i][0]);
            max1=Math.max(max1,num1[i][0]);
          } 
      for(int i=0;i<num2.length;i++){
         min1=Math.min(min1,num2[i][0]);
            max1=Math.max(max1,num2[i][0]);
        int val=map.getOrDefault(num2[i][0],0);
          map.put(num2[i][0],val+num2[i][1]);
      }
    for(int i=min1;i<=max1;i++){
        if(map.containsKey(i)){
            List<Integer> list=new ArrayList<>(2);
            list.add(i);
            list.add(map.get(i));
           res.add(list);
        }
    }
    return res;
    }
}