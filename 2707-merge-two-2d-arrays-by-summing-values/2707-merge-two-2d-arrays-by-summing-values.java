class Solution {
    public int[][] mergeArrays(int[][] num1, int[][] num2) {
        int count=num1.length;
        int[] arr=new int[1001];
        for(int i=0;i<num1.length;i++) arr[num1[i][0]]=num1[i][1];
        for(int i=0;i<num2.length;i++){
            if(arr[num2[i][0]]!=0){
                arr[num2[i][0]]=arr[num2[i][0]]+num2[i][1];
            }
            else{
                arr[num2[i][0]]=num2[i][1];
                count++;
            }
        }
        int[][] res=new int[count][2];
        int j=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
            res[j][0]=i;
            res[j++][1]=arr[i];
           }
        }
        return res;
    }
}