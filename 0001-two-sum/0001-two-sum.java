class Solution {
    public int[] twoSum(int[] arr, int target) {
         HashMap<Integer,Integer> hm = new  HashMap<>();
        for(int i = 0;i < arr.length;i++) hm.put(arr[i],i);
        int ans[]=new int[2];
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(target-arr[i]) && i != hm.get(target-arr[i])){
                      ans[0]=i;
                      ans[1] = hm.get(target-arr[i]);  
                      break;  
            }
        }
        return ans;
    }
    }