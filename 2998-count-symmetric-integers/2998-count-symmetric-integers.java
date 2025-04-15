class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(i<=10) continue;
             int sum1=0;
              int sum2=0;
            String a=String.valueOf(i);
          //  if(a.length()%2==0){
                for(int j=0;j<a.length()/2;j++){
                   sum1=sum1+Integer.valueOf(a.charAt(j));
                }
                for(int k=a.length()/2;k<a.length();k++){
                   sum2=sum2+Integer.valueOf(a.charAt(k));
                }
        //    }
            if(sum1==sum2) count++;
       }
        return count;
    }
}