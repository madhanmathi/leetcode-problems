class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>> res=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String org=arr[i];
            char[] ch=arr[i].toCharArray();
            Arrays.sort(ch);
            String sh=String.valueOf(ch);
            if(map.containsKey(sh)){
                List<String> current=map.get(sh);
                current.add(org);
              
            }
            else {
                List<String> nlist=new ArrayList<>();
                nlist.add(org);
                map.put(sh,nlist);
            }
        }
        for(Map.Entry<String,List<String>> it:map.entrySet()){
            // System.out.print(it.getKey()+" "+it.getValue());
            // System.out.println();
            res.add(it.getValue());
        }
        return res;
    }
}