class Solution {
    public int firstUniqChar(String s) {


        int a=Integer.MAX_VALUE;
        for(char c='a';c<='z';c++){
            int index=s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
              a=Math.min(a,index);
            }
        }
  return a==Integer.MAX_VALUE?-1:a;
    }
}