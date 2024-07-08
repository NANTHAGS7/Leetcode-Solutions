class Solution {

    public static int solve(int n,int k){
        if(n == 1) return 0;
        return (solve(n-1,k)+k)%n;
    }

    public int findTheWinner(int n, int k) {
        // Queue<Integer> q = new LinkedList<>();

        // for(int i=1;i<=n;i++){
        //     q.add(i);
        // }

        // while(q.size() > 1){
        //     for(int j=1;j<k;j++){
        //         q.add(q.peek());
        //         q.poll();
        //     }
        //     q.poll();
        // }
        // return q.peek();
        return solve(n,k)+1;
    }
}