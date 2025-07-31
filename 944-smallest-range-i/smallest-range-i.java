class Solution {
    public int smallestRangeI(int[] nums, int k) {


        int min=nums[0],max=min;
        for(int j=1;j<nums.length;j++){

            if(nums[j]>max){
                max=nums[j];
            }
            else if(nums[j]<min){
                min=nums[j];
            }
        }
        return Math.max(0,max-min-2*k);
        
    }
}