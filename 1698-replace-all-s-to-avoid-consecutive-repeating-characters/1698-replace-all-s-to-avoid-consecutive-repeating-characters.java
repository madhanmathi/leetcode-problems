class Solution {
    public String modifyString(String s) {
        int[] arr=new int[26];
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch!='?'){
                 arr[ch-97]++;
            }
            else count++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            if(count==0) break;
            if(arr[i]==0){
              char ch=(char)(i+97);
                sb.append(ch);
                count--;
            }
        }
        StringBuilder sb2=new StringBuilder();
        int k=0;
        for(int i=0;i<s.length();i++){
            if(k==sb.length()) k=0;
            if(s.charAt(i)=='?') sb2.append(sb.charAt(k++));
            else sb2.append(s.charAt(i));
        }
       return sb2.toString(); 
    }
}