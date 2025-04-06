class Solution {
    public int findFinalValue(int[] nums, int k) {
        int val=0;
        for(int i=0;i<nums.length;i++){
         if(nums[i]==k) {
            val=k;
            break;
         }
        }
        if(val==0) return k;
        while(true){
        boolean flag=false;
             val=val*2;
            for(int i=0;i<nums.length;i++){
                if(val==nums[i]) flag=true;
            }
            if(!flag) break;
        }
        return val;
    }
}