class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list=new ArrayList<>(1);
     for(int i=1;i<=n;i++){
        if(i%3==0 && i%5==0) {
            list.add("FizzBuzz");
            continue;
        }
        if(i%3==0) {
            list.add("Fizz");
            continue;
        }
        if(i%5==0) {
            list.add("Buzz");
            continue;
        }
        else list.add(String.valueOf(i));
     }
     return list; 
    }
}