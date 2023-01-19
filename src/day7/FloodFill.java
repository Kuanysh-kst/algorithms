package day7;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor != color) {
            fill(image, sr, sc, originalColor, color);
        }
        return image;
    }

    private void fill(int[][] image, int r, int c, int originalColor, int color) {
        if (r < 0 || r >= image.length
                || c < 0 || c >= image[0].length
                || image[r][c] != originalColor) {
            return;
        }
        image[r][c] = color;
        fill(image, r - 1, c, originalColor, color); //up
        fill(image, r + 1, c, originalColor, color); //down
        fill(image, r, c - 1, originalColor, color); //left
        fill(image, r, c + 1, originalColor, color); //right
    }
}
