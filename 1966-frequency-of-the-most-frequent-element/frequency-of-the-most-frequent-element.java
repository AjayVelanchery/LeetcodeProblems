class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);
             int left=0;
             int maxFreq=0;
             long total=0;
            
        for(int right=0;right<nums.length;right++)
        {
            total+=nums[right];
            long cost=(long)(right-left+1)*nums[right]-total;
   
              while(cost>k){
                total-=nums[left];
                left++;
                cost=(long)(right-left+1)*nums[right]-total;
              }
maxFreq=Math.max(maxFreq,right-left+1);

        }
    
    return maxFreq;
    }
}