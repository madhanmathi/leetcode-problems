class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>(5);
        for(int i=0;i<arr.length;i++)if(arr[i]==target)list.add(i);    
    return list;
    }
}