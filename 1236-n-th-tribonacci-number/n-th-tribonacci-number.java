class Solution {
    public int tribonacci(int n) {
        
        if(n==1||n==2){
            return 1;
        }

        int t=0;
        int t1=1;
        int t2=1;
        int sum=0;

        for(int i=2;i<n;i++){

            sum=t+t1+t2;

            t=t1;
            t1=t2;
            t2=sum;
        }
    return sum;
    }
}