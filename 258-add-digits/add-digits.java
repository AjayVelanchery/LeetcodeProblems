class Solution {
    public int addDigits(int num) {

        int sum=0;
        int num1=0;
        int sum1=0;
        int num2=0;
        int num3=0;
        int sum2=0;
        while(num>0){

          num1=num%10;
            sum=sum+num1;
            num=num/10;
        }

        if (sum<10){
            return sum;
        }
        else{
          while(sum>0){
            num1=sum%10;
            sum1=sum1+num1;
            sum=sum/10;
            
          }}
         

          if(sum1<10){
             return sum1;

          }
          else{
              while(sum1>0){
            num3=sum1%10;
            sum2=sum2+num3;
            sum1=sum1/10;

          }}
          return sum2;
            
        
        
    }
}