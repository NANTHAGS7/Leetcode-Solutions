class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles >= numExchange){
            ans++;
            numBottles -= numExchange;
            numBottles++;
            numExchange++;
        }
        return ans;
    }
}