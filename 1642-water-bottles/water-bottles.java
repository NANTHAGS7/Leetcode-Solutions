class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int res = numBottles;
        // while(numBottles >= numExchange){
        //     res += numBottles/numExchange;
        //     numBottles = numBottles/numExchange + numBottles % numExchange;
        // }
        // return res;

        return numBottles + (numBottles - 1)/(numExchange - 1);     //O(1) -> constant space
    }
}