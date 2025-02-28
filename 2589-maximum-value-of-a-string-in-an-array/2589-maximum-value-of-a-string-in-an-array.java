class Solution {
    public int maximumValue(String[] arr) {
        int max=0; 
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
           for(int j=0;j<arr[i].length();j++){
            if(arr[i].charAt(j) >= 'a' && arr[i].charAt(j) <='z') flag=false;
           }
           if(flag) {
            if(Integer.valueOf(arr[i])  > max) max=Integer.valueOf(arr[i]);
           }
           else if(arr[i].length()>max) max=arr[i].length();
        }
        return max;
    }
}