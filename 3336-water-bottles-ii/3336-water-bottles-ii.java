class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrank = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            empty -= numExchange;   
            totalDrank++;           
            empty++;                
            numExchange++;          
        }

        return totalDrank;
    }
}
