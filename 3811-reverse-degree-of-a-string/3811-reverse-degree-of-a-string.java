class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum=sum+(123-s.charAt(i))*(i+1);
        }
        return sum;
    }
}