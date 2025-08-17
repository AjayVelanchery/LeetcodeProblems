class Solution {
    public char findTheDifference(String s, String t) {
        
char res=0;
        for(char ch:s.toCharArray()){
         res^=ch;
        }

        for(char c:t.toCharArray()){
            res^=c;
        }

        return res;
    }
}