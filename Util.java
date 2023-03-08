package myjava;

public class Util {

    // 打印一维数组
    public static void PrintOne(int[] res) {
        for (int i : res) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }

    // 打印二维数组
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
