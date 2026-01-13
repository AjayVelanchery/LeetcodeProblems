class Solution {
    public boolean isAnagram(String s, String t) {
if(t.length()!=s.length()){
    return false;
}
        int []frequency=new int[26];

        for(char c:s.toCharArray()){

            frequency[c-'a']++;
        }

        for(char c:t.toCharArray()){
            frequency[c-'a']--;
        }

        for(int count:frequency){
            if(count>0){
                return false;
            }
        }
        return true;
    }
}