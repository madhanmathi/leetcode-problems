class Solution {
    public String restoreString(String s, int[] indices) {
        char[] b=new char[indices.length];
        for(int i=0;i<b.length;i++){
        b[indices[i]]=s.charAt(i);
        }
        return String.valueOf(b);
    }
}