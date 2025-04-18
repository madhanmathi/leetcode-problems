class Solution {
    public String stringHash(String s, int k) {
        String a="";
        for(int i=0;i<s.length();i+=k){
             int sum=0;
            for(int j=i;j<i+k;j++){
             sum+=(s.charAt(j)-97);
            }
            int val=sum%26;
         a=a+String.valueOf((char)(val+'a'));
        }
        return a;
    }
}