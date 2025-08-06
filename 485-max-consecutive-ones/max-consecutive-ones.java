class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max=0;
        int result=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==1){
               max+=1;

               result=Math.max(result,max);
            }
            else{
                max=0;
            }
            
        }
        return result;
    }
}