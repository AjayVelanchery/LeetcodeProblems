class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int arr[]=new int[nums.length];

        int index=0;
        int left=0;
        int right=nums.length-1;

        for(int n:nums){

            if(n%2==0){
                arr[left++]=n;
            }
            else{
              arr[right--]=n;
            }
        }

        

        return arr;
    }
}