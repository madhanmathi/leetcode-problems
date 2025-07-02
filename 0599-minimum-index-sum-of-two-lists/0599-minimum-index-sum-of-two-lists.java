class Solution {
    public String[] findRestaurant(String[] arr1, String[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr1[i].equals(arr2[j])){
                 list.add(i+j);
                 list.add(i);
            }
        }
       }
       int min=Integer.MAX_VALUE;
     for(int i=0;i<list.size()-1;i+=2){
          min=Math.min(min,list.get(i));
     }
     List<String> list2=new ArrayList<>();
     for(int i=0;i<list.size()-1;i+=2){
        if(min==list.get(i)) list2.add(arr1[list.get(i+1)]);
     }
     String[] arr=new String[list2.size()];
     for(int i=0;i<arr.length;i++) arr[i]=list2.get(i);
     return arr;
    }
}