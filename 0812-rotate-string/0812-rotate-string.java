class Solution {
    public boolean rotateString(String s, String goal) {
        char[] arr=s.toCharArray();
        for(int i=1;i<=arr.length;i++){
            char ch=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=ch;
            if((String.valueOf(arr)).equals(goal)) return true;
        }
        return false;
    }
}