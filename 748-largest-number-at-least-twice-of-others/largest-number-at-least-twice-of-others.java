class Solution {
    public int dominantIndex(int[] nums) {
    
             int []arr=nums.clone();
    
  Arrays.sort(nums);
        int number=nums[nums.length-1];
       if(number>=(2*(nums[nums.length-2]))){

        for(int i=0;i<arr.length;i++){
           if(arr[i]==number){
            return i;
           } 
        }
       }
        return -1;
    }
}