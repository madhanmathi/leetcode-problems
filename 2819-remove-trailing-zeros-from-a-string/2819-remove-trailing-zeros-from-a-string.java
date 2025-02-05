class Solution {
    public String removeTrailingZeros(String num) {
        int count=0;
        String b="";
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)!='0') break;
            else count++;
        }
        int val=num.length()-count;
    for(int i=0;i<val;i++){
        b=b+String.valueOf(num.charAt(i));
    }
    return b;
    }
}