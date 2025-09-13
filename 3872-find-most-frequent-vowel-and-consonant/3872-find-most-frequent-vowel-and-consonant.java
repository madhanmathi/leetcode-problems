class Solution {
    public int maxFreqSum(String s) {
        int[] arr=new int[26];
        int max1=0;
        int max2=0;
        for(char ch:s.toCharArray()) arr[ch-97]++;
        for(int i=0;i<26;i++){
            char ch=(char)(i+97);
            if(("aeiou").contains(String.valueOf(ch))){
                max1=Math.max(max1,arr[i]);
            }
            else{
                max2=Math.max(max2,arr[i]);
            }
        }
        return max1+max2;
    }
}