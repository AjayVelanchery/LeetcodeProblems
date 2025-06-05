class Solution {
    public boolean isPalindrome(int x) {
        
      int x1=0,x2=0;int x3=x;
        while(x>0){
            
            x1=x%10;
            x2=x2*10+x1;
            x=x/10;

        }
        if(x2==x3){
            return true;
        }
        else {
            return false;
        }
    }
}