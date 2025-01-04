class Solution {
    public String kthDistinct(String[] arr, int k) {
     ArrayList<String> list=new ArrayList<>();
     int count=0;
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i].equals(arr[j])) count++;
        }
        if(count==1) list.add(arr[i]);
        count=0;
     }  
     if(k>list.size()) return ""; 
     return (list.get(k-1));
    }
}