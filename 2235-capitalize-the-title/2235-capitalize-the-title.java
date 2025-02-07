class Solution {
    public String capitalizeTitle(String t) {
        String[] arr=t.split(" ");
        String b="";
        for(int i=0;i<arr.length;i++){
          if(arr[i].length()<=2) b=b+arr[i].toLowerCase()+" ";
          else{
     b=b+String.valueOf(arr[i].charAt(0)).toUpperCase()+arr[i].substring(1).toLowerCase()+" ";
          }
        }
        return b.trim();
    }
}