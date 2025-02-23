class Solution {
    public int minimumSum(int num) {
        int[] arr=new int[4];
        int i=0;
        while(num!=0){
            arr[i++]=num%10;
            num=num/10;
        }
        Arrays.sort(arr);
        String a=String.valueOf(arr[0])+String.valueOf(arr[4-1]);
         String b=String.valueOf(arr[1])+String.valueOf(arr[4-2]);
         return Integer.valueOf(a)+Integer.valueOf(b);
    }
}