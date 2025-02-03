class Solution {
    public int numOfStrings(String[] arr, String a) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(a.contains(arr[i])) count++;
        }
        return count;
    }
}