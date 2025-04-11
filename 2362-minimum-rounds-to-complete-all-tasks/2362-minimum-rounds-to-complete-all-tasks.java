class Solution {
    public int minimumRounds(int[] arr) {
        Arrays.sort(arr);
        int ans=0;
        int i=0;
        while(i<arr.length){
            int count=1;
            while(i+1!=arr.length&&arr[i]==arr[i+1]){
                count++;
                i++;
            }
            if(count==1) return -1;
            if(count%3==0) ans=ans+(count/3);
            else ans=ans+((count/3)+1);
            i++;
        }
        return ans;
    }
}