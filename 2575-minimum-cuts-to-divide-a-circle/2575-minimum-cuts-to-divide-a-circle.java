class Solution {
    public int numberOfCuts(int n) {
        int sum;
         if(n<=1) return 0;
        if(n%2==0){
          sum=n/2;
          return sum;
        }
        return n; 
    }
}