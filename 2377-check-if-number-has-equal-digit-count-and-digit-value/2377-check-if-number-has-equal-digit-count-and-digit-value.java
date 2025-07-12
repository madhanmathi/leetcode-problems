class Solution {
    public boolean digitCount(String s) {
        int n=s.length();
        int[] arr=new int[10];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'0']++;
        }
        for(int i=0;i<n;i++){
            int val=s.charAt(i)-'0';
            if(val!=arr[i]) return false;
        }
        return true;
    }
}