class Solution {
    public int m, n;
    public boolean dfs(char[][] grid,int i,int j,char c,boolean[][] vis,int pi,int pj){
        if(i<0 || j<0 || m<=i || n<=j  || grid[i][j]!=c ){
            return false;
        }
        if(vis[i][j]){
            return true;
        }
        vis[i][j]=true;
        return (!(i+1==pi && j==pj) && dfs(grid,i+1,j,c,vis,i,j)) ||
                (!(i==pi && j+1==pj) && dfs(grid,i,j+1,c,vis,i,j)) ||
                (!(i-1==pi && j==pj) && dfs(grid,i-1,j,c,vis,i,j)) ||
                (!(i==pi && j-1==pj) && dfs(grid,i,j-1,c,vis,i,j));

    }
    public boolean containsCycle(char[][] grid) {
        this.m=grid.length;
        this.n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] ){
                    char c=grid[i][j];
                    if(dfs(grid,i,j,c,vis,-1,-1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}