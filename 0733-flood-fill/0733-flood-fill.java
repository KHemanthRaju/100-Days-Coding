class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]!=color) dfs(image, sr, sc, image[sr][sc],color);
        return image;
    }
    
    public void dfs(int[][] image, int i,int j, int c0, int c1){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length||image[i][j]!=c0) 
            return;
        image[i][j]=c1;
        dfs(image, i, j - 1, c0, c1);
        dfs(image, i, j + 1, c0, c1);
        dfs(image, i - 1, j, c0, c1);
        dfs(image, i + 1, j, c0, c1);
    }
}