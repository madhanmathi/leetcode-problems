class Solution {
    public int maximumUniqueSubarray(int[] nums) {
          Set<Integer> set = new HashSet<>();
        int val = 0;
        int max = 0;
        int s = 0;
        int e = 0;
        int n = nums.length;
        while(e<n) {
            if (!set.contains(nums[e])) {
                set.add(nums[e]);
                val += nums[e];
                max = Math.max(max, val); 
                e++;
            } else {
                while (set.contains(nums[e])) {
                    set.remove(nums[s]);
                    val -= nums[s];
                    s++;
                }
            }
        }

        return max;
    }
}