class Solution {
    public int countPoints(String s) {
        int[] r=new int[10];
        int[] g=new int[10];
        int[] b=new int[10];
        for(int i=0;i<s.length();i+=2){
            char ch=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch=='R') r[ch2-'0']++;
            else if(ch=='G') g[ch2-'0']++;
            else if(ch=='B') b[ch2-'0']++;
        }
        int count=0;
        for(int i=0;i<10;i++){
            if(r[i]>0&&g[i]>0&&b[i]>0) count++;
        }
        return count;
    }
}