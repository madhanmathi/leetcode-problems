class Solution {
    public int numberOfSpecialChars(String word) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(char i:word.toCharArray()){
            if(i>='a'&&i<='z') arr1[i-97]++;
            else arr2[i-65]++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(arr1[i]!=0&&arr2[i]!=0){
             count++;
            }
        }
        return count;
    }
}