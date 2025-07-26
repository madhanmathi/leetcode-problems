class Solution {
    public int hammingDistance(int start, int goal) {
        String a=Integer.toBinaryString(start);
      String b=Integer.toBinaryString(goal); 
      int val=0;
      String c="";
      if(a.length()!=b.length()) val=Math.abs(a.length()-b.length());
      for(int i=0;i<val;i++) c+='0';
      if(a.length()>b.length()) b=c+b;
      if(b.length()>a.length()) a=c+a;
      int s=a.length()-1;
      int e=b.length()-1;
      int count=0;
     while(s>=0&&e>=0){
        if(a.charAt(s)!=b.charAt(e)){
            count++;
            s--;
            e--;
            continue;
        }
         s--;
         e--;
     }
      return count;
    }
}