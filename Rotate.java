package myjava;

public class Rotate {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int l = 0, r = n - 1;
        while (l < r) {
            for (int i = 0; i < n; i++) {
                int tmp = matrix[l][i];
                matrix[l][i] = matrix[r][i];
                matrix[r][i] = tmp;
            }
            l++;
            r--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}