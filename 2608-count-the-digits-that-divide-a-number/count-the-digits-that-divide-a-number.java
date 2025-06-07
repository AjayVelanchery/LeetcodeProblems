class Solution {
    public int countDigits(int num) {

        int num1;
      int   num2=num;
        int i=0;
        while(num>0){
            num1=num%10;

            if(num2%num1==0){
                i++;
            }
            num=num/10;
        }
        return i;
    }
}