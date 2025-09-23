class Solution {
    public int findDuplicate(int[] nums) {
        return cyclicSort(nums);
    }

    public int cyclicSort(int []nums){

int n=nums.length;
int i=0;


while(i<n){
if(nums[i]!=i+1){
int correct=nums[i]-1;
if(nums[i]!=nums[correct]){
    swap(nums,i,correct);
}
else{
    return nums[i];
    }}else{
    i++;
}}
return -1;
    }

    static void swap(int []arr,int first,int second){

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}