class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {


        int total=numBottles;
        int drinkBottles=numBottles;
        


        while(drinkBottles>=numExchange){

            int remainderBottles=drinkBottles%numExchange;
            drinkBottles/=numExchange;

            total+=drinkBottles;
           
       
            if(remainderBottles>0){
                drinkBottles+=remainderBottles;
            }
            
        }
        return total;
            }
}