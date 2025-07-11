class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
    boolean flag=true;
    if(num<0) flag=false;
    num=Math.abs(num);
    StringBuilder sb=new StringBuilder();
        while(num!=0){
            int rem=num%7;
           sb.append(String.valueOf(rem));
           num/=7;
        }
        sb.reverse().toString();
        if(!flag) sb.insert(0,"-");
        return sb.toString();
    }
}