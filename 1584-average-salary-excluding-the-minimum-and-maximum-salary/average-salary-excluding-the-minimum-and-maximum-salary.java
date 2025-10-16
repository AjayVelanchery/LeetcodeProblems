class Solution {
    public double average(int[] salary) {
       
         double avg=0;
        // int max2=Integer.MIN_VALUE;
        // int min2=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<salary.length;i++){
            
            max=Math.max(max,salary[i]);
              min=Math.min(min,salary[i]);
        }
    int count=0;
    for(int i=0;i<salary.length;i++){
        if(salary[i]!=max&&salary[i]!=min){
    avg+=salary[i];
    count++;}
    }
 return avg/count;
    
    }

}