class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        int a=0;
        for(int i=0;i<costs.length;i++){
            a=a+costs[i];
            if(a>coins){
                a=a-costs[i];
                continue;
            }
            if(a<=coins) count++;
        }
        return count;
    }
}