class Solution {
    public int maximum69Number (int num) {
      String a=String.valueOf(num);
     char[] ch=a.toCharArray();
     int n=ch.length;
     for(int i=0;i<n;i++){
        if(ch[i]=='6'){
            ch[i]='9';
            break;
        }
     }
      return Integer.valueOf(new String(ch));
    }
}