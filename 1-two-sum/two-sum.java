class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        HashMap<Integer,Integer> contains=new HashMap<>();

        for(int i=0;i<nums.length;i++){
          
          int complement=target-nums[i];

            if(contains.containsKey(complement)){
                return new int[]{contains.get(complement),i};
            }

            contains.put(nums[i],i);
        }

        return new int[]{};
    }
}