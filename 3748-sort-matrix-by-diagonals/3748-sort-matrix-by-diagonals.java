class Solution {
    public int[][] sortMatrix(int[][] arr) {
      for(int i=1;i<arr.length;i++){
        int r=0;
        int c=i;
        List<Integer> list=new ArrayList<>();
        while(r<arr.length&&c<arr[0].length){
          list.add(arr[r++][c++]);
        }
        r=0;
        c=i;
        Collections.sort(list);
         while(r<arr.length&&c<arr[0].length){
         arr[r++][c++]= list.remove(0);
        }
      }  
      for(int i=0;i<arr.length;i++){
        int r=i;
        int c=0;
        List<Integer> list=new ArrayList<>();
        while(r<arr.length&&c<arr[0].length){
          list.add(arr[r++][c++]);
        }
        r=i;
        c=0;
        Collections.sort(list);
        Collections.reverse(list);
         while(r<arr.length&&c<arr[0].length){
         arr[r++][c++]= list.remove(0);
        }
      }  
      return arr;
    }
}