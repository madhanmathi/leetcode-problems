class Solution {
    public int smallestNumber(int n) {
      String a=Integer.toBinaryString(n);
      a=a.replace("0","1");
      return Integer.valueOf(a,2);
    }
}