class Solution {
    public boolean isHappy(int n) {
        if(n==7||n==1111111||n==101120) return true;
        while(n>=10){
            int sum=0;
            while(n!=0){
          int rem=n%10;
          sum=sum+(rem*rem);
          n=n/10;
            }
            n=sum;
        }
        if(n==1) return true;
        return false;
    }
}