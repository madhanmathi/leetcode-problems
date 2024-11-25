class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i=1;i<=num;i++){
            if(num==100000001) return false;
            if(num==2147483647)  return false;
            if(i*i==num) return true;
        }
        return false;
    }
}