class Solution {
    public int maximumWealth(int[][] accounts) {
        
   return func(accounts);
    }
     
    static int func(int[][] accounts){
        
        int rich=0;
        for (int i =0; i < accounts.length; i++) {
            int sum=0;
         for(int j=0;j<accounts[i].length;j++){

            sum=sum+accounts[i][j];
         }
if(sum>rich)
{
    rich=sum;
}
        }
return rich;

        
    }
}