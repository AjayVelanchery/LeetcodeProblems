class Solution {
    public String firstPalindrome(String[] words) {

        
        for(String s:words){
         int left=0,  right=s.length()-1;
         boolean palindrome=true;
       
          for(   ;left<right;left++,right--){
            if(s.charAt(left)!=s.charAt(right)){
                palindrome=false;
                break;
                }
             }
          if(palindrome){
                return s;
            }

        }
        return "";
    }
}