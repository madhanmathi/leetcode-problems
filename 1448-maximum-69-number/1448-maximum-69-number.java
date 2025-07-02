class Solution {
    public int maximum69Number (int num) {
        String a=String.valueOf(num);
        String b="";
        boolean flag=true;
      for(int i=0;i<a.length();i++){ 
           if(a.charAt(i)=='6'&&flag==true){
            b+='9';
            flag=false;
           }
           else b+=a.charAt(i);
      }
      System.out.print(a);
        return Integer.valueOf(b);
    }
}