class Solution {
    public int similarPairs(String[] arr) {
        String a="";
        String[] val=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            a="";
            for(int j=0;j<arr[i].length();j++){
                if(!a.contains(String.valueOf(arr[i].charAt(j)))) a=a+arr[i].charAt(j);
            }
            val[i]=a;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            char[] nums=val[i].toCharArray();
            Arrays.sort(nums);
            val[i]=String.valueOf(nums);
        }
        System.out.print(Arrays.toString(val));
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if(val[i].equals(val[j])) count++;
        }
    }
    return count;
    }
}