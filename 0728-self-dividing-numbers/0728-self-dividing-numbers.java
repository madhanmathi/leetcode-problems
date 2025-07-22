class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        int val=0;
        for(int i=left;i<=right;i++){
            val=i;
            int count=0;
            while(val!=0){
                int rem=val%10;
              if(rem!=0&&i%rem==0) count++;
                val/=10;
            }
            int res=(int)Math.floor(Math.log10(i))+1;
            if(count==res) list.add(i);
        }
        return list;
    }
}