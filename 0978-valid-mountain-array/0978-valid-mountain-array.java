class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        if(arr[0]>arr[1]) return false;
        int count=1;
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                if(flag==false) return false;
                flag=true;
                count++;
            }
            if(arr[i]>arr[i+1]) flag=false;
            if(arr[i]==arr[i+1]) return false;
        }
        if(count==arr.length) return false;
        if(flag==true) return false;
        return true;
    }
}