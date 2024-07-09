class Solution {
    public double averageWaitingTime(int[][] customers) {
        long n = customers.length;
        long wait = 0;
        long busy = 0;
        for(int i=0;i<n;i++){
            long arrival = customers[i][0];
            long time = customers[i][1];
            wait += Math.max(arrival,busy) + time - arrival;
            busy = Math.max(arrival,busy) + time;
        }
        return (wait * 1.0)/n;
    }
}