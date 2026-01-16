class Solution {
    public String reverseWords(String s) {

        String []words=s.split("\\s+");

        StringBuilder reversed=new StringBuilder();

        for(String word:words){

            StringBuilder reverse=new StringBuilder(word);

            reversed.append(reverse.reverse()).append(" ");
        }

        return reversed.toString().trim();
        
    }
}