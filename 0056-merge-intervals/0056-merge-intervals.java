class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] ar=new int[intervals.length][2];
        int p=0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int k=0;
        int fs=intervals[0][0];
        int ss=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=ss){
                ss=Math.max(intervals[i][1],ss);
                fs=Math.min(intervals[i][0],fs);
            }else{
                ar[k][0]=fs;
                ar[k++][1]=ss;
                p++;
                 fs=intervals[i][0];
                 ss=intervals[i][1];
            }
        }
        if(ar[k][1]!=intervals[intervals.length-1][1]){
            ar[k][0]=fs;
            ar[k++][1]=ss;
            p++;
        }
        int[][] ar1=new int[p][2];
        for(int i=0;i<p;i++){
            if(ar[i][1]!=0){
                ar1[i][0]=ar[i][0];
                ar1[i][1]=ar[i][1];
            }
        }
        return ar1;
    }
}
