class Solution {
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    q.offer(new int[]{i,j});
                }
            }
        }
        if(q.isEmpty() || q.size()==n*n){
            return -1;
        }
        int dis = 0;
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                int cur[] = q.poll();
                int x = cur[0];
                int y = cur[1];
                for(int d[]:dir){
                    int i = x + d[0];
                    int j = y + d[1];
                    if(i>=0 && i<n && j>=0 && j<n && grid[i][j] == 0){
                        grid[i][j] = 1;
                        q.offer(new int[]{i,j});
                    }
                }
            }
            dis++;
        }
        return dis - 1;
    }
}