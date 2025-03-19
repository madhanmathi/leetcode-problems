class Solution {
    public boolean isAnagram(String a, String b) {
        int[] arr=new int[26];
       for(char c:a.toCharArray()){
        arr[c-97]++;
       }
        for(char c:b.toCharArray()){
        arr[c-97]--;
       }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
              return false;
            }
        }
   return true;
    }
}