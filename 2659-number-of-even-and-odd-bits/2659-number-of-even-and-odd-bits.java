class Solution {
    public int[] evenOddBit(int n) {
        int[] arr=new int[2];
        String a=Integer.toBinaryString(n);
        int k=0;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='1'&&k%2==0) arr[0]++;
             if(a.charAt(i)=='1'&&k%2!=0) arr[1]++;
             k++;
        }
        return arr;
    }
}