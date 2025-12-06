class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
HashMap<Character,Integer> hs=new HashMap<>();

for(int i=0;i<order.length();i++){
    hs.put(order.charAt(i),i);
}

for(int i=1;i<words.length;i++){

    String s=words[i];
    String s1=words[i-1];
  for (int j = 0; j < s1.length(); j++) {
                if (j == s.length()){
                    return false;
                }

    if(hs.get(s.charAt(j))>hs.get(s1.charAt(j))){

        break;
    }
   if(hs.get(s.charAt(j))<hs.get(s1.charAt(j))){
        return false;
    }



  }}
  return true;

    }
}