class Solution {
    public int m,n;
    public void dfs(int[][] grid,int i,int j,boolean[][] vis){
        if(i<0 || j<0 || m<=i || n<=j || vis[i][j]==true || grid[i][j]==1 ){
            return;
        }
        vis[i][j]=true;
        grid[i][j]=1;
        dfs(grid,i-1,j,vis);
        dfs(grid,i,j-1,vis);
        dfs(grid,i,j+1,vis);
        dfs(grid,i+1,j,vis);
    }
    public int closedIsland(int[][] grid) {
        this.m=grid.length;
        this.n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            if(grid[i][0]==0 && vis[i][0]==false){
                dfs(grid,i,0,vis);
            }
            if(grid[i][n-1]==0 && vis[i][n-1]==false){
                dfs(grid,i,n-1,vis);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[0][i]==0 && vis[0][i]==false){
                dfs(grid,0,i,vis);
            }
            if(grid[m-1][i]==0 && vis[m-1][i]==false){
                dfs(grid,m-1,i,vis);
            }
        }
        int count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0 && vis[i][j]==false){
                    count++;
                    dfs(grid,i,j,vis);
                }
            }
        }
        return count;

        
    }
}