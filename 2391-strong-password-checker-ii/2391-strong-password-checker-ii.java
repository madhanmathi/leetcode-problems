class Solution {
    public boolean strongPasswordCheckerII(String arr) {
        if(arr.length()<8) return false;
        int l=0;
        int u=0;
        int d=0;
        int s=0;
        for(int i=0;i<arr.length();i++){
            if(i<arr.length()-1&&arr.charAt(i)==arr.charAt(i+1)) return false;
            if(Character.isLowerCase(arr.charAt(i))) l++;
            if(Character.isUpperCase(arr.charAt(i))) u++;
            if(Character.isDigit(arr.charAt(i))) d++;
            if("!@#$%^&*()-+".indexOf(arr.charAt(i))!=-1) s++;
        }
        if(u==0||l==0||d==0||s==0) return false;
        return true;
    }
}