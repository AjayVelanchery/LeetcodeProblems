class Solution {
    public int[] twoSum(int[] numbers, int target) {


        int length=numbers.length;
        int start=0;
        int end=length-1;
        int ans[]=new int[2];
        int sum=0;
        
        for(int i=0;i<length;i++){
            
            sum=numbers[start]+numbers[end];

            if(sum==target){
                ans[0]=start+1;
                ans[1]=end+1;
            }
            else if(sum>target){
                end--;
            }
            else{

                start++;
            }

        }
        return ans;
    }
}