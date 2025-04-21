class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            int val=i;
            int sum=0;
            while(val!=0){
            sum=sum+val%10;
            val=val/10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int max=0;
        for(int i:map.keySet()){
           if(map.get(i)>max) max=map.get(i); 
        }
        int count=0;
        for(int i:map.keySet()){
            if(map.get(i)==max) count++;
        }
        return count;
    }
}