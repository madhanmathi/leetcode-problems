class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int sum=0;
        for(int i=0;i<commands.size();i++){
            if(commands.get(i).equals("RIGHT")) sum++;
            if(commands.get(i).equals("LEFT")) sum--;
            if(commands.get(i).equals("UP")) sum=sum-n;
            if(commands.get(i).equals("DOWN")) sum=sum+n;
            
        }
        return sum;
    }
}