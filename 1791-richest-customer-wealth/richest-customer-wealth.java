class Solution {
    public int maximumWealth(int[][] accounts) {
int max=0;
        for(int []n: accounts){
            int sum=0;

            for(int i:n){
                sum+=i;
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}