class Solution {
    public int getCommon(int[] num1, int[] num2) {
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i]<num2[j]) break;
                if(num1[i]==num2[j]){
                  return num1[i];
                }   
            }
        } 
        return -1;
    }
}