class Solution {
    public int vowelStrings(String[] arr, int left, int right) {
        int n=arr.length;
        String b="aeiou";
      //  String c="";
        int count=0;
        for(int i=left;i<=right;i++){
        if(b.contains(String.valueOf(arr[i].charAt(0)))){
           if(b.contains(String.valueOf(arr[i].charAt(arr[i].length()-1)))) {
               count++;
           }
        }
        }
        return count;
    }
}