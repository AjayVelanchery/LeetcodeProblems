class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int arr[]=new int[nums.length];

        int index=0;

        for(int n:nums){

            if(n%2==0){
                arr[index++]=n;
            }
        }

        for(int n:nums){

            if(n%2!=0){
                arr[index++]=n;
            }
        }
        

        return arr;
    }
}