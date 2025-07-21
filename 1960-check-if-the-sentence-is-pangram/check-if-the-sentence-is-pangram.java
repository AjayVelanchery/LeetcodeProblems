class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Set<Character>st=new HashSet<>();
for(char i='a';i<='z';i++){
    st.add(i);
}

 for(int i=0;i<sentence.length();i++){

    if(st.contains(sentence.charAt(i))){
        st.remove(sentence.charAt(i));
    }
 }

 if(st.isEmpty()){
    return true;
 }
 return false;
    }
}