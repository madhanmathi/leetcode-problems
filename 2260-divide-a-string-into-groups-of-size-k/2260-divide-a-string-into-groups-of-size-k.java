class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int i=0;
        int val=0;  
        List<String> list=new ArrayList<>();
        while(i<n){
           String b="";
           val=k;
           while(i<n&&val!=0){
            b+=s.charAt(i);
            val--;
            i++;
           }
           list.add(b);
        }
        String[] arr=new String[list.size()];
        for(int j=0;j<arr.length;j++){
            arr[j]=list.get(j);
        }
        int res=list.get(list.size()-1).length();
        if(res==k) return arr;
       String c=arr[arr.length-1];
       for(int j=0;j<val;j++) c+=fill;
       arr[arr.length-1]=c;
       return arr; 
    }
}