class Solution {
    public int dominantIndex(int[] nums) {
 int p=0;int max=0;
         for(int i=0;i<nums.length;i++){
         if(nums[i]>nums[max]){
              max=i;
             
         }  }
           for(int i=0;i<nums.length;i++){
            if(nums[max]!=nums[i]&&2*nums[i]>nums[max])
{
    return -1;
}
         }
         return max;
         }
}