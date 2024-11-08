class Solution {
    public int mostWordsFound(String[] arr) {
        int k=0;
    int count=1;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length();j++){
        if(!(arr[i].charAt(j)>='a' && arr[i].charAt(j)<='z')){
                 count++;
        }
        }
        if(count>k) k=count;
        count=1;  
    }
    return k;
    }
}