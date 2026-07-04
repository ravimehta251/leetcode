class Solution {
    public int lu(int[] heights) {
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>(); 

        for (int i = 0; i < heights.length; i++) {
            int start = i;

            while (!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                int[] top = stack.pop();
                int index = top[0];
                int height = top[1];

                maxArea = Math.max(maxArea, height * (i - index));
                start = index;
            }

            stack.push(new int[]{start, heights[i]});
        }

        while (!stack.isEmpty()) {
            int[] top = stack.pop();
            int index = top[0];
            int height = top[1];

            maxArea = Math.max(maxArea, height * (heights.length - index));
        }

        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {
        int[][] mat=new int[matrix.length][matrix[0].length];

        int max=0;

        for(int col=0;col<matrix[0].length;col++){
            mat[0][col]=matrix[0][col]== '1' ? 1:0;
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1') mat[i][j]=mat[i-1][j]+1;
            }
        }
        for(int[] ar:mat){
            max=Math.max(max,lu(ar));
        }
        return max;
    }
}