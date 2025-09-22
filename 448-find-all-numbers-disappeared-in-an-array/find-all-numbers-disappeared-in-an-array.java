class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       return sort(nums);
    }

     static List<Integer> sort(int []arr){

        int i=0;
        int n=arr.length;
        while(i<n){
        int correct=arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
        }else {
            i++;
        }

    }
    ArrayList <Integer> ls=new ArrayList<>();
    for(int j=0;j<n;j++){
      if(arr[j]!=j+1){
      ls.add(j+1);
      }
    }
    // if(!ls.isEmpty()){
    //     return ls;
    // }else{
    //     ls.add(n);
    // }
    return ls;
    }

    static void swap(int[] arr,int start,int end) {

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}