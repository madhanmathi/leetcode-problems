class Solution {
    public String frequencySort(String s) {
        int[] arr=new int[128];
        char[] ch=s.toCharArray();
        for(char c:ch) arr[c]++;
        StringBuilder b=new StringBuilder();
        while(true){
            int max=Integer.MIN_VALUE;
            char val=0;
            for(int i=0;i<128;i++){
                if(arr[i]>max){
                    max=arr[i];
                    val=(char)i;
                }
            }
            b.append(String.valueOf(val).repeat(max));
            arr[val]=0;
            if(max==0) break;
        }
        return b.toString();
    }
}