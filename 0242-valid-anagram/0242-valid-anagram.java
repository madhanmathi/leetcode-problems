class Solution {
    public boolean isAnagram(String a, String b) {
        int[] arr=new int[26];
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++){
          char ch1=a.charAt(i);
          char ch2=b.charAt(i);
            arr[ch1-97]++;
            arr[ch2-97]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
              return false;
            }
        }
   return true;
    }
}