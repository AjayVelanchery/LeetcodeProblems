class Solution {
    public boolean detectCapitalUse(String word) {

 int i=0;int k=0;
        for(int j=0;j<word.length();j++){
            if(Character.isUpperCase(word.charAt(j))){
          i++;}
          else{
            k++;
          }

            

        }

        if(i==0||i==word.length()){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0))&&k==word.length()-1){
            return true;
        }
        return false;
    }
}