class Solution {
    public int sumCounts(List<Integer> nums) {
        int val=2;
        int sum=0;
        if(nums.size()==1) return 1;
        while(val<nums.size()){
       for(int i=0;i<=nums.size()-val;i++){
        HashSet<Integer> set=new HashSet<>();
        for(int j=i;j<i+val;j++){
         set.add(nums.get(j));
        }
        sum=sum+(int)(Math.pow(set.size(),2));
       }
       val=val+1;
        }
      HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<nums.size();i++){
                  set.add(nums.get(i));
        }
        sum=sum+(int)(Math.pow(set.size(),2));
    return sum+nums.size();
    }
}