class Solution {
    public int fib(int n) {
        
if(n==1){

    return 1;
}
int n1=0;
int next=1;
int sum=0;
   for(int i=1;i<n;i++){
sum=n1+next;
n1=next;
next=sum;

   }

   return sum;


    }
}