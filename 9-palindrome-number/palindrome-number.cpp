class Solution {
public:
    bool isPalindrome(int x) {
        
        int x1=0;
        int x2=x;
        long x3=0;
        while(x2>0){
       
       x3=x3*10+x2%10;
      x2/=10;
        }
        if(x3==x){
            return true;

        }
        return false;
    }
};