class Solution {
    public int lastRemaining(int n) {
      int head=1;
      int step=1;
      boolean flag=true;
      while(n>1){
     if(flag||n%2!=0){
        head+=step;
     }
     n/=2;
     step*=2;
     flag=!flag;
      }
      return head;
    }
}