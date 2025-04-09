class Solution {
    public List<List<Integer>> findWinners(int[][] arr) {
        List<List<Integer>> res=new ArrayList<>();
      int[] arr1=new int[100001]; 
       int[] arr2=new int[100001]; 
       for(int i=0;i<arr.length;i++){
         arr1[arr[i][0]]++;
       }
        for(int i=0;i<arr.length;i++){
         arr2[arr[i][1]]++;
       }
       List<Integer> list=new ArrayList<>();
       for(int i=1;i<arr1.length;i++){
        if(arr1[i]>=1&&arr2[i]==0) list.add(i);
       }
         List<Integer> list2=new ArrayList<>();
         for(int i=1;i<arr2.length;i++){
            if(arr2[i]==1) list2.add(i);
          }
          res.add(list);
          res.add(list2);
          return res;
    }
}