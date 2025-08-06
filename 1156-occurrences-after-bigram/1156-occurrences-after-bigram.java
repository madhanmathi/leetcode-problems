class Solution {
    public String[] findOcurrences(String t, String f, String s) {
       List<String> list=new ArrayList<>();
       String[] arr=t.split(" ");
       for(int i=0;i<arr.length-2;i++){
        if(arr[i].equals(f)&&arr[i+1].equals(s)) list.add(arr[i+2]);
       }
       String[] res=new String[list.size()];
       int k=0;
       for(String i:list) res[k++]=i; 
       return res;
    }
}