class Solution {
    public int findNumbers(int[] nums) {
        int num1=0;
       
     int k=0;
    for(int i=0;i<nums.length;i++){
         int j=0;
        while(nums[i]>0){

       
           j++;
           nums[i]=nums[i]/10;
        }
             
        if(j%2==0){
            k++;
        }
    }
     return k;
    }
}