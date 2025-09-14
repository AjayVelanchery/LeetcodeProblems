/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
      int  n=mountainArr.length();

        int peak=peakElement(mountainArr,n);
        int left=binarySearch(mountainArr,0,peak,target,true);
        if(left!=-1)return left;

        return binarySearch(mountainArr,peak+1,n-1,target,false);

    }


    static int binarySearch(MountainArray arr,int start,int end,int target,boolean isAscending){


        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)==target){
                return mid;
            }

            if(isAscending){
                if(arr.get(mid)<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }

            }
                else{
                    if(arr.get(mid)<target){
                                 end=mid-1;                }
                else{
                   start=mid+1;                }
                }
        }
return -1;

    }
static int peakElement(MountainArray arr,int n){
    int left=0;
    int right=n-1;
    while(left<right){
        int mid=left+(right-left)/2;

        if(arr.get(mid)>arr.get(mid+1)){
            right=mid;
        }
        else{
            left=mid+1;
        }
           
        

    }
    return left;
}

    
}