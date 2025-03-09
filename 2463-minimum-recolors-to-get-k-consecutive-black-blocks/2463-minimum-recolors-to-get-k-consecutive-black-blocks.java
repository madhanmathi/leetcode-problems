class Solution {
    public int minimumRecolors(String s, int k) {
        int count=0;
        int val=0;
        for(int i=0;i<s.length();i++) {
          if(s.charAt(i)=='B') count++;
          else count=0;
          if(count>val) val=count; 
        }
        if(val>=k) return 0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            count=0;
            val=0;
            if((s.length()-i)>=k){
            for(int j=i;j<s.length();j++){
            if(s.charAt(j)=='W') count++;
            else val++;
            if((count+val)==k) break;
            }
            }
            if(count<min&&count!=0) min=count;
        }
        return min;
    }
}