class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int e) {
        int maxval=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        List<Boolean> list=new ArrayList<>(arr.length);
        for(int i=0;i<arr.length;i++){
            list.add((arr[i]+e)>=maxval);
        }
        return list;
    }
}