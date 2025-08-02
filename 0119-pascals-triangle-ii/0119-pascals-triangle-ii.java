class Solution {
    public List<Integer> getRow(int n) {
         List<List<Integer>> res=new ArrayList<>();
         List<Integer> ans=new ArrayList<>();
         List<Integer> list=new ArrayList<>();
         ans.add(1);
         res.add(ans);
        for(int i=1;i<n+2;i++){
             list.add(1);
           for(int j=0;j<ans.size()-1;j++){
             list.add(ans.get(j)+ans.get(j+1));
           } 
           list.add(1);
           ans=new ArrayList<>(list);
          res.add(ans);
          list.clear();
        }
        return res.get(n);
    }
}