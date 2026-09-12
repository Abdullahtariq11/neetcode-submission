class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;

        boolean [][] pacific = new boolean [row][col];
        boolean [][] atlantic = new boolean [row][col];

        for(int c =0; c< col; c++){
            dfs(0, c, pacific, heights, Integer.MIN_VALUE);
        }

        for(int r =0; r< row; r++){
             dfs(r, 0, pacific, heights, Integer.MIN_VALUE);
        }

        for(int c =0; c< col; c++){
            dfs(row - 1, c, atlantic, heights, Integer.MIN_VALUE);
        }

        for(int r =0; r< row; r++){
            dfs(r, col - 1, atlantic, heights, Integer.MIN_VALUE);
        }


        List<List<Integer>> result = new ArrayList<>();

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {

                if (pacific[r][c] && atlantic[r][c]) {
                    result.add(Arrays.asList(r, c));
                }
            }
        }

        return result;



    }

    void dfs(int r,int c,boolean[][] visited,int[][] heights, int previousHeight) 
    {
        if (r < 0 || c < 0 ||r >= heights.length ||c >= heights[0].length) {
            return;
        }

        if (visited[r][c]) {
            return;
        }

        // We are moving backwards from ocean.
        // Current cell must be same height or higher.
        if (heights[r][c] < previousHeight) {
            return;
        }

        visited[r][c] = true;

        int currentHeight = heights[r][c];

        dfs(r + 1, c, visited, heights, currentHeight);
        dfs(r - 1, c, visited, heights, currentHeight);
        dfs(r, c + 1, visited, heights, currentHeight);
        dfs(r, c - 1, visited, heights, currentHeight);
    }
}

