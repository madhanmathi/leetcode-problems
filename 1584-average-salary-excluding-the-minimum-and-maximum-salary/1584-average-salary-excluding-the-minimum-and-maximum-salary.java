class Solution {
    public double average(int[] arr) {
        Arrays.sort(arr);
        double c=0;
        int count=arr.length-2;
        for(int i=0;i<arr.length-1;i++)if(arr[i+1]<arr[arr.length-1]) c=c+arr[i+1];
        c=c/count;
        return c;
    }
}