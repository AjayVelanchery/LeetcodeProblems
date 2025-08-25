class Solution {
    public int findLHS(int[] nums) {

        HashMap<Integer,Integer> hp=new HashMap<>();

        for(int num:nums){
            hp.put(num,hp.getOrDefault(num,0)+1);
        }
int max=0;
        for(int key:hp.keySet()){
              if(hp.containsKey(key+1)){

                max=Math.max(max,hp.get(key)+hp.get(key+1));
              }
        }
        return max;
    }
}