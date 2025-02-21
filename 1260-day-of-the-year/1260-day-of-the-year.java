class Solution {
    public int dayOfYear(String date) {
      String[] arr=date.split("-");
      int y=Integer.valueOf(arr[0]);  
      int m=Integer.valueOf(arr[1]);  
      int d=Integer.valueOf(arr[2]);  
      int[] rev={31,28,31,30,31,30,31,31,30,31,30,31};
      int sum=0;
      for(int i=0;i<m-1;i++){
        sum=sum+rev[i];
      }
      sum=sum+d;
      if ((m>2)&&( (y% 4 == 0 && y % 100 != 0) || (y % 400 == 0))) return sum+1;
      return sum;
    }
}