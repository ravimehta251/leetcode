class Solution {
    public int m,n;
    public void dfs(int[][] vis, int[][] grid ,int i ,int j,int l){
        if(i==m || j== n || i<0 || j<0 || grid[i][j]==0 || vis[i][j]!=0){
            return ;
        }
        vis[i][j]=l;
        dfs(vis,grid,i+1,j,l);
        dfs(vis,grid,i-1,j,l);
        dfs(vis,grid,i,j+1,l);
        dfs(vis,grid,i,j-1,l);
    }
    public int maxAreaOfIsland(int[][] grid) {
        this.m=grid.length;
        this.n=grid[0].length;
        int count=0;
        int[][] vis=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    count++;
                    dfs(vis,grid,i,j,count);
                }
            }
        }
        int[] arr=new int[count];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if( vis[i][j]!=0){
                    arr[vis[i][j]-1]++;
                }
            }
        }
        int max=0;
        for(int num:arr){
            max=Math.max(max,num);
        }
        return max;

    }
}