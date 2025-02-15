class Solution {
    public boolean isValid(String w) {
        if(w.length()<3) return false;
        String a="0123456789";
        String b="aeiouAEIOU";
        int count=0;
        int k=0;
        int val=0;
        for(int i=0;i<w.length();i++){
            if(b.contains(String.valueOf(w.charAt(i)))) k++;
    if(a.contains(String.valueOf(w.charAt(i)))||b.contains(String.valueOf(w.charAt(i)))){
        count++;
    }
     if(!b.contains(String.valueOf(w.charAt(i)))&&(w.charAt(i)>='A'&&w.charAt(i)<='Z')){
            count++;
            val++;
        }
        if (!b.contains(String.valueOf(w.charAt(i)))&&(w.charAt(i)>='a'&&w.charAt(i)<='z')){
            count++;
            val++;
        }
        }
        if(w.length()==count&&k>=1&&val>=1) return true;
        return false;
    }
}