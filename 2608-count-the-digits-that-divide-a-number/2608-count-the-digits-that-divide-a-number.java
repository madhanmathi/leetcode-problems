class Solution {
    public int countDigits(int num) {
      int res=num;
        int count=0;
        while(num>0){
            int rem=num%10;
                num=num/10;
                if(res%rem==0) count++;
            }
            
            return count;   
    }
}