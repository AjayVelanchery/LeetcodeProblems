class Solution {
    public int[] sortArrayByParity(int[] nums) {


        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){

             stack.push(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
            stack.push(nums[i]);
        }}
Integer[] boxed = stack.toArray(new Integer[0]);

       
        int[] result = new int[boxed.length];
        for (int i = 0; i < boxed.length; i++) {
            result[i] = boxed[i]; 

    

        
    }
        return result;}
}