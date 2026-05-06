class Solution {
    public boolean isPalindrome(int x) {


        int x1=x;
        int reverse=0;
        int n=0;
        while(x1>0){
        n=x1%10;
        reverse=reverse*10+n;
        x1=x1/10;
      
            
        }
        if(reverse==x){
            return true;
        }
        return false;
    }
}