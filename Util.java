package myjava;

public class Util {
    public static void PrintTwo(int[][] res) {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
