class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

      List<Integer> li=new ArrayList<>();
      Set<Integer> st=new HashSet<>();
for(int n:nums){
  st.add(n);
}
for(int i=1;i<=nums.length;i++){
  if(!st.contains(i)){
    li.add(i);
  }
}
     
      
        return li;
    }
}