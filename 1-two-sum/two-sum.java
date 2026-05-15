class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans=new int [2];

        HashMap <Integer,Integer> hs=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int y=target-nums[i];

            if(hs.containsKey(y)){
                return new int[]{hs.get(y),i};
            }
            hs.put(nums[i],i);
        }
        return ans;
    }
}