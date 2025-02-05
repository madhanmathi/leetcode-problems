class Solution {
    public void duplicateZeros(int[] arr) {
         String b="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) b=b+String.valueOf(arr[i])+"0";
            else b=b+String.valueOf(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.valueOf(b.charAt(i)-48);
        }
        System.out.println(Arrays.toString(arr));
    }
}