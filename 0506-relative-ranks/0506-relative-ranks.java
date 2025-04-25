class Solution {
    public String[] findRelativeRanks(int[] arr) {
        int n=arr.length;
        int[] res=Arrays.copyOf(arr,n);
        Arrays.sort(res);
        Map<Integer,String> map=new HashMap<>();
        map.put(res[n-1],"Gold Medal");
        if(n>1){
        map.put(res[n-2],"Silver Medal");
        }
        if(n>2){
        map.put(res[n-3],"Bronze Medal");
        int j=4;
        for(int i=n-4;i>=0;i--){
            map.put(res[i],String.valueOf(j++));
        }
        }
        String[] val=new String[n];
        int k=0;
        for(int i:arr){
         val[k++]=map.get(i);
        }
        return val;
    }
}