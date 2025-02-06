class Solution {

    public void dfs(int[][] image, int sr, int sc, int ini_color, int tar_color, int[] del_row, int[] del_col){
        image[sr][sc] = tar_color;

        int max_r = image.length;
        int max_c = image[0].length;

        int n_row = sr;
        int n_col = sc;

        for(int i = 0; i < 4; i++){
            n_row = sr + del_row[i];
            n_col = sc + del_col[i];

            if(n_row >= 0 && n_row <= max_r - 1 &&
               n_col >= 0 && n_col <= max_c - 1 &&
               image[n_row][n_col] == ini_color &&
               image[n_row][n_col] != tar_color){
                dfs(image, n_row, n_col, ini_color, tar_color, del_row, del_col);
               }
        }


    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] modified = image;
        int ini_color = image[sr][sc];

        int[] del_row = {-1, 0, +1, 0};
        int[] del_col = {0, +1, 0, -1};

        dfs(modified, sr, sc, ini_color, color, del_row, del_col);
        return modified;
    }
}