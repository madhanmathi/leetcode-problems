class Solution {
    public int[] findEvenNumbers(int[] arr) {
       int[] freq=new int[10];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=100;i<1000;i+=2){
            int ch=i;
            int count=0;
            int[] val=Arrays.copyOf(freq,freq.length);
            while(ch!=0){
                int ans=ch%10;
                if(val[ans]>0){
                     count++;
                     val[ans]--;
                }
                ch=ch/10;
            }
            if(count==3) list.add(i);
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        Arrays.sort(res);
        return res;
    }
}