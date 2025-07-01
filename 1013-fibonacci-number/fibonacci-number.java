class Solution {
    public int fib(int n) {
  if(n==0){
    return 0;
  }
  else if(n==1){
    return 1;
  }
else{
    int num1=fib(n-1);
    int num2=fib(n-2);
    return num1+num2;
}
    
    }
}