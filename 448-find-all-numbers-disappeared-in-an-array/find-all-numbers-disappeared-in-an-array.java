class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      
List<Integer> ls=new ArrayList<>();
      int n=nums.length;
      int freq[]=new int[n+1];
      for(int num:nums){
        freq[num]++;
      }

      for(int i=1;i<freq.length;i++){
        if(freq[i]==0){
          ls.add(i);
        }
      }
        return ls;
    }
}