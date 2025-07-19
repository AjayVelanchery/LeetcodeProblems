class Solution {
    public boolean isAnagram(String s, String t) {


        char []chr=s.toCharArray();
        char []ch=t.toCharArray();


        Arrays.sort(chr);
        Arrays.sort(ch);
        
        
        if(Arrays.equals(chr,ch)){
            return true;
        }
        else{
            return false;

        }        
    }
}