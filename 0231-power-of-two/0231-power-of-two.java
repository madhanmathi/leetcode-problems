class Solution {
    public boolean isPowerOfTwo(int num) {
        if(num<=0) return false;
      if((num & (num - 1)) == 0) return true;
      return false;
    }
}