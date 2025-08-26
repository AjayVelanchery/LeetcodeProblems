class Solution {
    public String reverseVowels(String s) {

        char []c=s.toCharArray();

        Set<Character> st=new HashSet<>();

        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');st.add('u');
        st.add('A');
        st.add('E');
        st.add('I');
        st.add('O');
        st.add('U');
        int left=0;
        int right=c.length-1;

        while(left<right){

            while(left<right&&!st.contains(c[left])){
                left++;
            }


            while(left<right&&!st.contains(c[right])){
                right--;
            }

            if(left<right){
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;

                left++;
                right--;
            }
      
        
        }
          return new String(c);
    }
}