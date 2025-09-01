class Solution {
    public int countCharacters(String[] words, String chars) {
int sum=0;        
      int []chars1=new int[26];
        for(char c:chars.toCharArray()){
         
         chars1[c-'a']++;
        }


        for(String s:words){
          int []freq=new int[26];
            for(char c1:s.toCharArray()){
           freq[c1-'a']++;
            }
            boolean confirm=true;

       for(int i=0;i<26;i++){
        if(freq[i]>chars1[i]){
          confirm=false;
          break;
        }
       }
       if(confirm){
        sum+=s.length();
       }
        }

        return sum;
    }
}