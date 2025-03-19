class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-97]++;
        }
        for(int i=0;i<n;i++){
            if(arr[s.charAt(i)-97]==1) return i;
        }
        return -1;
    }
}