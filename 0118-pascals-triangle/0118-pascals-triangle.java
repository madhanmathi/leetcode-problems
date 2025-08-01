class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res=new ArrayList<>();
         List<Integer> ans=new ArrayList<>();
         List<Integer> list=new ArrayList<>();
         ans.add(1);
         res.add(ans);
        for(int i=1;i<n;i++){
             list.add(1);
           for(int j=0;j<ans.size()-1;j++){
             list.add(ans.get(j)+ans.get(j+1));
           } 
           list.add(1);
           ans=new ArrayList<>(list);
          res.add(ans);
          list.clear();
        }
        return res;
    }
}