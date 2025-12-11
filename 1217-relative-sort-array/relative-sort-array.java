class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

      int k=0;
     List<Integer> ls=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){

            for(int j=0;j<arr1.length;j++){

                if(arr2[i]==arr1[j]){
                ls.add(arr1[j]);

                }
            }
        }

 
        int arr3[]=new int[arr1.length-ls.size()];
        int h=0;
            for(int j=0;j<arr1.length;j++){

            if(!ls.contains(arr1[j])){
           arr3[h]=arr1[j];
           h++;
            }
        }
        Arrays.sort(arr3);



        int arr4[]=new int [arr1.length];
       int h1=ls.size();
        for(int i=0;i<ls.size();i++){
            arr4[i]=ls.get(i);
           
        }  
  
        for(int j=0;j<arr3.length;j++){
           
            arr4[h1]=arr3[j];
              h1++;
           
        }    

        return arr4; 
    
}}