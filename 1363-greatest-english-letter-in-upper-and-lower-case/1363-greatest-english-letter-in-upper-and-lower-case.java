class Solution {
    public String greatestLetter(String s) {
        int[] arr=new int[26];
        int[] arr2=new  int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z') arr[s.charAt(i)-97]++;
            else arr2[s.charAt(i)-65]++;
        }
        char a=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0&&arr2[i]!=0) a=(char)(i+65);
        }
        if(a=='\u0000') return "";
        return String.valueOf(a);
    }
}