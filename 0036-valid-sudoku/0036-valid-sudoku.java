class Solution {
    public boolean isValidSudoku(char[][] arr) {
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if ( arr [ i ] [ j ] != '.' && arr [ i ] [ j ] != ',' ) if ( !set.add ( arr [ i ] [ j ] ) ) return false;

            }
        }
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
  if ( arr [ j ] [ i ] != '.' && arr [ j ] [ i ] != ',' ) if ( !set.add ( arr [ j ] [ i ] ) ) return false;
                
            }
        }
        Set<Character> set=new HashSet<>();
      for(int i=0;i<9;i+=3){
       for(int j=0;j<9;j++){
if(set.contains(arr[i][j])||set.contains(arr[i+1][j])||set.contains(arr[i+2][j])) return false;
if(arr[i][j]>='1'&&arr[i][j]<='9') set.add(arr[i][j]);
if(arr[i+1][j]>='1'&&arr[i+1][j]<='9') set.add(arr[i+1][j]);
if(arr[i+2][j]>='1'&&arr[i+2][j]<='9') set.add(arr[i+2][j]);
if((j+1)%3==0) set.clear();
       }
      }
      return true;
    }
}