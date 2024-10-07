class Solution {
    public List<Integer> stableMountains(int[] arr, int t) {
        ArrayList<Integer> list=new ArrayList<>(5); 
   for(int i=1;i<arr.length;i++){
    if(arr[i-1]>t){
        list.add(i);
    }
   }
   return list;
    }
}