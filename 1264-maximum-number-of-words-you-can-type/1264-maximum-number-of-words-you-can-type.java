class Solution {
    public int canBeTypedWords(String s, String b) {
        int[] arr=new int[26];
        for(char ch:b.toCharArray()) arr[ch-97]++;
        String[] res=s.split(" ");
        int count=0;
        for(int i=0;i<res.length;i++){
            boolean flag=true;
            for(char ch:res[i].toCharArray()){
             if(arr[ch-97]>=1){
                flag=false;
                break;
             }
            }
            if(flag) count++;
        }
        return count;
    }
}