class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int e) {
        int maxval=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        ArrayList<Boolean> list=new ArrayList<>(1);
        for(int i=0;i<arr.length;i++){
            if((arr[i]+e)>=maxval) list.add(true);
            else list.add(false);
        }
        return list;
    }
}