class Solution {
    public int subtractProductAndSum(int n) {
         int ans=1;
        int sum=0;
        while(n>0){
        int rem=n%10;
            n=n/10;
            ans=ans*rem;
            sum=sum+rem;
        }
        return ans-sum;
    }
}