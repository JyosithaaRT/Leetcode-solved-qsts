class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] t = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int value = image[i][n - 1 - j];
                if (value == 0) {
                    t[i][j] = 1;
                } else {
                    t[i][j] = 0;
                }
            }
        }

        return t;
    }
}