class Solution {
    public int[] findErrorNums(int[] nums) {
     return sort(nums);  
    }


    public int[] sort(int []nums){

        int i=0;
        int n=nums.length;
        while(i<n){
int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);

            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[]{nums[index],index+1};
            }
        }
        return new int[]{-1,-1};
    } 


    static void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}