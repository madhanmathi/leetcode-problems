class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       Map<Integer,Integer> map=new LinkedHashMap<>();
       List<Integer> list=new ArrayList<>();
       int[] arr=new int[k];
       for(int i=0;i<mat.length;i++){
        int sum=0;
        for(int j=0;j<mat[0].length;j++){
           sum+=mat[i][j];
        }
        map.put(i,sum);
        list.add(sum);
       } 
     Collections.sort(list);
     int val=0;
     for(int i=0;i<k;i++){
        for(int j=0;j<mat.length;j++){
            if(list.get(i)==map.get(j)){
                arr[val++]=j;
                map.put(j,-1);
                break;
            }
        }
     }
     return arr;
    }
}