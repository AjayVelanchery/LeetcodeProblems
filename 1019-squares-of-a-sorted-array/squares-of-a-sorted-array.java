class Solution {
    public int[] sortedSquares(int[] nums) {

        int length=nums.length;
        int []arr=new int[length];

       int start=0;
       int end=length-1;
       int pointer=length-1;

       while(start<=end){

       int st=nums[start]*nums[start];
       int en=nums[end]*nums[end];


       if(st>en){
        arr[pointer]=st;
        start++;
       }
       else{

        arr[pointer]=en;

        end--;
       }
pointer--;
       }

       return arr;
        
    }
}