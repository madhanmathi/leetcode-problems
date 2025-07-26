class Solution {
    public int bitwiseComplement(int num) {
           String a=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder(a);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1') sb.setCharAt(i,'0');
            else  sb.setCharAt(i,'1');
        }
        return Integer.valueOf(sb.toString(),2);
    }
}