class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1') count++;
    }
    String a="";
    for(int i=0;i<count;i++){
     a+="1";
    }
    if(s.contains(a)) return true;
    return false;
    }
}