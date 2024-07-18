class Solution {

    public void dfs(int grid[][],int i,int j,int dir[][],boolean vis[][],Queue<int[]> q){
        if(i<0 || i>=grid.length || j<0 ||j>=grid[0].length || vis[i][j] || grid[i][j] == 0){
            return;
        }
        vis[i][j] = true;
        q.offer(new int[]{i,j});
        for(int d[]:dir){
            dfs(grid,i+d[0],j+d[1],dir,vis,q);
        }
    }

    public int shortestBridge(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean vis[][] = new boolean[n][m];
        boolean found = false;
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    dfs(grid,i,j,dir,vis,q);
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        int step = 0;
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                int cur[] = q.poll();
                for(int d[]:dir){
                    int i = d[0] + cur[0];
                    int j = d[1] + cur[1];
                    if(i>=0 && i<n && j>=0 && j<m && !vis[i][j]){
                        if(grid[i][j] == 1){
                            return step;
                        }
                        q.offer(new int[]{i,j});
                        vis[i][j] = true;
                    }
                }
            }
            step++;
        }
        return -1;
    }
}