class Solution {
    public static int[] rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
   
return nums;

    }


    public static void reverse(int []nums,int start,int end){

        while(start<end){
         int temp=nums[start];
         nums[start]=nums[end];
         nums[end]=temp;
            start++;
            end--;
        }
    }
}