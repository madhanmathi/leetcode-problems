class Solution {
    public boolean wordPattern(String a, String s) {
        Map<Character,String> map=new HashMap<>();
        char[] ch=a.toCharArray();
        String[] arr=s.split(" ");
        if(ch.length!=arr.length) return false;
         Set<Character> set1=new HashSet<>();
              Set<String> set2=new HashSet<>();
              for(int i=0;i<ch.length;i++){
                set1.add(ch[i]);
                set2.add(arr[i]);
              }
              if(set1.size()!=set2.size()) return false;
        for(int i=0;i<arr.length;i++){
              map.put(ch[i],arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(!(map.get(ch[i]).equals(arr[i]))) return false;
        }
        return true;
    }
}