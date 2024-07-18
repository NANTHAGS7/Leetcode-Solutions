class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0] == 1 || grid[n-1][m-1] == 1) return -1;
        Queue<List<Integer>> q = new LinkedList<>();
        q.add(Arrays.asList(0,0));
        boolean vis[][] = new boolean[n][m];
        vis[0][0] = true;
        int ans = 0;
        int dir[][] = {{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                List<Integer> cur = q.poll();
                if(cur.get(0) == n-1 && cur.get(1) == m-1){
                    return ans+1;
                }
                for(int k=0;k<8;k++){
                    int nextX = dir[k][0] + cur.get(0);
                    int nextY = dir[k][1] + cur.get(1);
                    if(nextX>=0 && nextX<n && nextY>=0 && nextY<m && !vis[nextX][nextY] && grid[nextX][nextY]==0){
                        q.add(Arrays.asList(nextX,nextY));
                        vis[nextX][nextY] = true;
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}