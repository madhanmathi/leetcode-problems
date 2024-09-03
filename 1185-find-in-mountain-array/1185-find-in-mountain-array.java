/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    static int func(MountainArray m,int target){
            int s=0;
            int e=m.length()-1;
            while(s<e){
                int mid=s+(e-s)/2;
                if(m.get(mid)<m.get(mid+1)){
                    s=mid+1;
                }
                else{
                    e=mid;
                }
            }
            return s;
        }
        static int bs1(MountainArray m,int s,int e,int target){
            while(s<=e){
                int mid=s+(e-s)/2;
                if(m.get(mid)==target){
                    return mid;
                }
                else if(m.get(mid)<target){
                    s=mid+1;
                }
                
                else{
                    e=mid-1;
                }
            }
            return -1;
    
        }
         static int bs2(MountainArray m,int s,int e,int target){
            while(s<=e){
                int mid=s+(e-s)/2;
                if(m.get(mid)==target){
                    return mid;
                }
                else if(m.get(mid)>target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            return -1;
    
        }
    public int findInMountainArray(int target, MountainArray m) {
          int pivot =  func(m,target);
          int find1=bs1(m,0,pivot,target);
        if(find1 == -1) find1 =bs2(m,pivot,m.length()-1,target);
        return find1;
    }


    }