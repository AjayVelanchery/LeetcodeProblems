class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

 Map<Integer,Integer> mp=new HashMap<>();
 List<Integer> ls=new ArrayList<>();

 for(int n:nums1){
    mp.put(n,mp.getOrDefault(n,0)+1);
 }

 for(int n1:nums2){
    if(mp.containsKey(n1)&&mp.get(n1)>0){
        ls.add(n1);
        mp.put(n1,mp.get(n1)-1);
    }

 }

 int arr[]=new int[ls.size()];
 for(int i=0;i<ls.size();i++){
    arr[i]+=ls.get(i);


 }
 return arr;

        
    }
}