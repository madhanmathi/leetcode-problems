class Solution {
    public int countPrefixSuffixPairs(String[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i<j){
                if(arr[j].endsWith(arr[i]) && arr[j].startsWith(arr[i])) count++;
                }
            }
        }
        return count;
    }
}