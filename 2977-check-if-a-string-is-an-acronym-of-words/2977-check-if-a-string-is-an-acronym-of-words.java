class Solution {
    public boolean isAcronym(List<String> list, String s) {
        String b="";
        for(int i=0;i<list.size();i++){
            b=b+list.get(i).charAt(0);
        }
        if(b.equals(s)) return true;
        return false;
    }
}