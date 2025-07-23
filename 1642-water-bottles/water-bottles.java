class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        if(numBottles<numExchange){
            return numBottles;
        }

        int numBottles1=numBottles;

        int drinkable=numBottles;
        int quotient=0;
        int remainder=0;
        while(numBottles1>=numExchange){
              
         quotient=numBottles1/numExchange;
         drinkable+=quotient;
          remainder=numBottles1%numExchange;
           
             numBottles1=  quotient+remainder;
        
    
        }
        return drinkable;
        
    }
}