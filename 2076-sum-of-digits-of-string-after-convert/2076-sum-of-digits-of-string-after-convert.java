class Solution {
    public int getLucky(String s, int k) {
        int res=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int val=ch-96;
            res=res+(val%10)+(val/10);
        }
        while(k>1){
            int sum=0;
            while(res!=0){
                sum=sum+(res%10);
                res=res/10;
            }
            res=sum;
            k--;
        }
        return res;
    }
}