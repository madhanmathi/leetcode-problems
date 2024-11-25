class Solution {
    public int balancedStringSplit(String s) {
        int count1=0;
        int count2=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') count1++;
            if(s.charAt(i)=='L') count2++;
            if(count1>0&&count2>0&&count1-count2==0){
                k++;
                count1=0;
                count2=0;
            }
        }
        return k;
    }
}