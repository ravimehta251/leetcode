class Solution {
    public int m,n;
    public void dfs(boolean[][] vis, char[][] grid ,int i ,int j){
        if(i==m || j== n || i<0 || j<0 || grid[i][j]=='0' || vis[i][j]==true){
            return ;
        }
        vis[i][j]=true;
        dfs(vis,grid,i+1,j);
        dfs(vis,grid,i-1,j);
        dfs(vis,grid,i,j+1);
        dfs(vis,grid,i,j-1);
    }
    public int numIslands(char[][] grid) {
        this.m=grid.length;
        this.n=grid[0].length;
        int count=0;
        boolean[][] vis=new boolean[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    count++;
                    dfs(vis,grid,i,j);
                }
            }
        }
        return count;
    }
}