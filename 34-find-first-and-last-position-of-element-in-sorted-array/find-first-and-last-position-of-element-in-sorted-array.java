class Solution {
    public int[] searchRange(int[] nums, int target) {
        
    int arr[]={-1,-1};

    arr[0]=occurence(nums,target,true);
    arr[1]=occurence(nums,target,false);

    return arr;
    
    }

        static int occurence(int []arr,int target,boolean isFirstOccurrence){

        int left=0;
        int right=arr.length-1;
         int index=-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
           
          if(arr[mid]==target){
             index=mid;
        
            if(isFirstOccurrence){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
                 
          
          }
        else  if(arr[mid]<target){
            left=mid+1;
          }
          else {
            right=mid-1;
          }

        }
        return index;
  
        }  
    
}