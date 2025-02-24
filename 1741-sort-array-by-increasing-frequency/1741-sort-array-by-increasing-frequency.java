class Solution {
    public int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=nums.length-1;i>=0;i--){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      PriorityQueue<Map.Entry<Integer,Integer>> heap=new PriorityQueue<>((a,b)-> {
        if(a.getValue()==b.getValue()) return Integer.compare(b.getKey(),a.getKey());
        return a.getValue()-b.getValue();
    });
    heap.addAll(map.entrySet());
    int j=0;
    while(!heap.isEmpty()){
        Map.Entry<Integer,Integer> hp=heap.poll();
        int n=hp.getValue();
    for(int i=0;i<n;i++){
     nums[j++]=hp.getKey();
    }
    }
    return nums;
    }
} 