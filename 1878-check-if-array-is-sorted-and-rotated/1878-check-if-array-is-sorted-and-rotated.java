class Solution {
    public boolean check(int[] arr) {
        int count1=0;
        int count2=0;
        int k=arr.length;
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        Arrays.sort(ans);
        System.out.print(Arrays.toString(ans));
        System.out.print(Arrays.toString(arr));
        while(k>0){
            int[] rev=new int[arr.length];
            for(int i=0;i<arr.length;i++){
                rev[i]=ans[(i+k)%arr.length];
            }
            if(Arrays.equals(arr,rev)) return true;
            k--;
        }
       
return false;
    }
}