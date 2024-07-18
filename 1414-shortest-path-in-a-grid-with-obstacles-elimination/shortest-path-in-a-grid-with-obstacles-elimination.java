class Solution {
    public int shortestPath(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,k});
        boolean vis[][][] = new boolean[n][m][k+1];
        int steps = 0;
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                int cur[] = q.poll();
                if(cur[0] == n-1 && cur[1] == m-1){
                    return steps;
                }
                for(int d[]:dir){
                    int i = cur[0] + d[0];
                    int j = cur[1] + d[1];
                    int obs = cur[2];

                    if(i>=0 && i<n && j>=0 && j<m){
                        if(grid[i][j] == 0 && !vis[i][j][obs]){
                            q.offer(new int[]{i,j,obs});
                            vis[i][j][obs] = true;
                        }
                        else if(grid[i][j] == 1 && obs > 0 && !vis[i][j][obs-1]){
                            q.offer(new int[]{i,j,obs-1});
                            vis[i][j][obs - 1] = true;
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}