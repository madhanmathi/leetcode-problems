class Solution {
    public int[][] modifiedMatrix(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             if(arr[i][j]==-1){
                list.add(i);
                list.add(j);
             }
            }
        }
        for(int i=0;i<list.size()-1;i+=2){
             int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                if(arr[j][list.get(i+1)]>max) max=arr[j][list.get(i+1)];
            }
            arr[list.get(i)][list.get(i+1)]=max;
        }
        return arr;
    }
}