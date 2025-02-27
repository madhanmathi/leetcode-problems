class Solution {
    public String replaceDigits(String a) {
       char[] arr=a.toCharArray();
       for(int i=1;i<arr.length;i+=2){
          arr[i]=(char)((a.charAt(i)-'0')+a.charAt(i-1));
       }
       return String.valueOf(arr);
    }
}