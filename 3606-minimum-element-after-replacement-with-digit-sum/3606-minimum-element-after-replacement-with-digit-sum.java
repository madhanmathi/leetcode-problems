class Solution {
    public int minElement(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int sum=0;
            while(arr[i]>0){
                sum=sum+arr[i] %10;
                arr[i]=arr[i]/10;   
            }
            arr[i] = sum;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}