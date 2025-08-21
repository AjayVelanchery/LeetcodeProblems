class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r=ransomNote.length();
        int m=magazine.length();

        if(m<r){
            return false;
        }
else{

    List<Character> ls=new ArrayList<>();
        for(int i=0;i<r;i++){
       ls.add(ransomNote.charAt(i));

    }
    for(int i=0;i<m;i++){
        if(ls.contains(magazine.charAt(i))){
            ls.remove(new Character(magazine.charAt(i)));
        }}

        if(ls.isEmpty()){
            return true;
        }
    }
    return false;
    }
}