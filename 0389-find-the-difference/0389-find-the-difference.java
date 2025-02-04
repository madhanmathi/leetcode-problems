class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            arr[ch-97]++;
        }
        for(int  i = 0;i < s.length();i++) {
            char ch=s.charAt(i);
            arr[ch-97]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==1) return (char)(i+97);
        }
        return t.charAt(0);
    }
}