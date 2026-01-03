class Solution {
    public int lengthOfLastWord(String s) {

        
String t=s.trim();
int length=0;
for(int i=t.length()-1;i>=0;i--){
if(!Character.isWhitespace(t.charAt(i))){

    length++;
}
else{
    break;
}

}
return length;
    }
}