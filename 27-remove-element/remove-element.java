class Solution {
    public int removeElement(int[] nums, int val) {
     int []expectedNums=new int[nums.length];
    int k=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]!=val){
               nums[k++]=nums[i];
            }
        }
        // Arrays.sort(expectedNums);
        // int k=expectedNums.length;
        return k;
        
    }
}