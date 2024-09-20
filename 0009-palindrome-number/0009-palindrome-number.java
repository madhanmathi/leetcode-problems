class Solution {
    public boolean isPalindrome(int x) {
    return func(x);    
    }
    static boolean func(int num){
            int res=num;
            int ans=0;
        while(num>0){
           int rem=num%10;
            num=num/10;
            ans=ans*10+rem;    
        }
        
       if(res==ans){
        return true;
       }
       return false;
}
}