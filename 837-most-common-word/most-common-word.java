class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

          paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

         String []words=paragraph.split("\\s+");
      Map<String,Integer> freq=new HashMap<>();
       Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));


      for(String word:words){
        if (!bannedSet.contains(word) && !word.isEmpty())

        freq.put(word,freq.getOrDefault(word,0)+1);
      }

  String freqCount=" ";
  int maxCount=0;
      for(Map.Entry<String,Integer> entry:freq.entrySet()){

        if(entry.getValue()>maxCount){
            freqCount=entry.getKey();
            maxCount=entry.getValue();
        }

        
      }
      return freqCount;
        
    }
}