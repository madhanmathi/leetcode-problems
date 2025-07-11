class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] arr=new int[201];
        for(int i:nums) arr[i]++;
        List<List<Integer>> res=new ArrayList<>();
        while(true){
            int count=0;
            List<Integer> list=new ArrayList<>();
            for(int i=1;i<201;i++){
               if(arr[i]!=0){
                list.add(i);
                arr[i]--;
                count++;
               }
            }
            if(count==0) break;
            res.add(list);
        }
        return res;
    }
}