class Solution {
    public boolean checkPerfectNumber(int num) {
        int count=0;
        for(int i=1;i<num;i++){
            if(num%i==0) count+=i;
        }
        return count==num;
    }
}