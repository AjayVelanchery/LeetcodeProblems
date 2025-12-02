class Solution {
    public String longestCommonPrefix(String[] strs) {


   Arrays.sort(strs);
if(strs.length==1){
    return strs[0];
}

String s="";
           

           for(int i=0;i<strs[0].length();i++){
    if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
          
        
{
      s+=strs[0].charAt(i);
 
  

}else{
    return s;
}

}
return s;
        
    }
}