class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int j=1;
         int topr=0;
        int botr=n-1;
        int leftc=0;
        int rightc=n-1;
        while(topr<=botr&&leftc<=rightc){
        for(int i=leftc;i<=rightc;i++) arr[topr][i]=j++;
        topr++;
        for(int i=topr;i<=botr;i++) arr[i][rightc]=j++;
        rightc--;
        if(topr<=botr){
        for(int i=rightc;i>=leftc;i--) arr[botr][i]=j++;
        }
        botr--;
        if(leftc<=rightc){
        for(int i=botr;i>=topr;i--) arr[i][leftc]=j++;
        }
        leftc++;
        }
        return arr;
    }
}