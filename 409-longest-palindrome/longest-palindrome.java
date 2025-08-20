class Solution {
    public int longestPalindrome(String s) {

        HashSet<Character> st=new HashSet<>();

        int length=0;

        for(char c:s.toCharArray()){

            if(st.contains(c)){
                st.remove(c);
                length+=2;
            }

            else{
                st.add(c);
            }

          
        }
          if(!st.isEmpty()){
                length+=1;
            }
        return length;
    }
}