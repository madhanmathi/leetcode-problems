class Solution {
    public int countPrefixes(String[] arr, String s) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(s.indexOf(arr[i])==0) count++;
        }
        return count;
    }
}