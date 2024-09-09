class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     image=func(image);
     return func1(image);   
    }
    static int[][] func(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
                }
            }
          
        return arr;
    }
   static int[][] func1(int[][] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j <arr[i].length; j++) {
            if(arr[i][j]==0) arr[i][j]=1;
            else arr[i][j]=0;
        }
        
    }
    return arr;
   }

}