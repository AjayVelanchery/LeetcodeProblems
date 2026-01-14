class Solution {
    public boolean isPalindrome(String s) {

        String s1="";

        for(char c:s.toCharArray()){
             if(Character.isLetterOrDigit(c)){
            s1+=c;}
        }
            String s2=s1.toLowerCase();
         
               String s3="";
            for(int i=s2.length()-1;i>=0;i--){
         s3+=s2.charAt(i);
                
            }

      if(s2.equals(s3)){
        return true;
      }

        return false;
        
    }
}