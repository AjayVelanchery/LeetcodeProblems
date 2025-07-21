class Solution {
    public boolean checkIfPangram(String sentence) {

        Set <Character> st=new HashSet<>();
        for(char c:sentence.toCharArray()){
            st.add(c);
        }

        if(st.size()==26){
            return true;
        }
        return false;
        
    }
}