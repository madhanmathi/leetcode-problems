class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList<>();
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
           arr[s.charAt(i)-97]=i;
        }
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-97;
            if(arr[val]>max){
                max=arr[val];
                count++;
            }
            else count++;
            if(max==i){
                list.add((count));
                count=0;
                max=0;
            }
        }
       // Collections.sort(list,Collections.reverseOrder());
        System.out.print(Arrays.toString(arr));
  return list;
    }
}