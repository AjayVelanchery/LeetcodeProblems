class Solution {
    public int maxSubArray(int[] nums) {


        int sum=0;
        int maxsum=nums[0];

        for(int n:nums){

            sum=Math.max(n,sum+n);
            maxsum=Math.max(maxsum,sum);
        }

        return maxsum;
        
    }
}