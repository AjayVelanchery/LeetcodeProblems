class Solution {
    public int fib(int n) {


        int n1=0;
        int n2=1;
        int next=0;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
        for(int i=0;i<n;i++){
             
         n1=n2;
          n2=next;

         next=n1+n2;

        }}
        return next;
    }
}