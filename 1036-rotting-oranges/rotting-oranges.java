class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        if(fresh == 0){
            return 0;
        }
        if(q.isEmpty()){
            return -1;
        }
        int time = 0;
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                int cell[] = q.poll();
                int x = cell[0];
                int y = cell[1];
                for(int d[]:dir){
                    int i = x + d[0];
                    int j = y + d[1];
                    if(i>=0 && i<n && j>=0 && j<m && grid[i][j] == 1){
                        grid[i][j] = 2;
                        q.offer(new int[]{i,j});
                        fresh--;
                    }
                }
            }
            time++;
        }
        // System.out.print(q.size());
        
        return fresh == 0?time - 1:-1;
    }
}