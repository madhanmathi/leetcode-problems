class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] res1=new int[1001];
        int[] res2=new int[1001];
        for(int i=0;i<arr.length;i++){
          if(arr[i]>=0) res1[arr[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) res2[Math.abs(arr[i])]++;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<res1.length;i++){
            if(res1[i]==0) continue;
            if(!list.contains(res1[i])) list.add(res1[i]);
            else return false;
        }
        for(int i=0;i<res2.length;i++){
            if(res2[i]==0) continue;
            if(!list.contains(res2[i])) list.add(res2[i]);
            else return false;
        }
      return true;
    }
}