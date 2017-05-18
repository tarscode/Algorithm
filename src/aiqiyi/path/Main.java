package aiqiyi.path;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: aiqiyi.path 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/14 下午8:49
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 过10%
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int rows = in.nextInt();
            int cols = in.nextInt();
            if (rows == 0 && cols == 0) {
                break;
            }
            char[][] arr = new char[rows][];
            for (int i = 0; i < rows; i++) {
                String str = in.next();
                arr[i] = str.toCharArray();
            }
            int[][] flag = new int[rows][cols]; //记录是否已经走过
            int res = helper(rows - 1, 0, rows, cols, arr, flag);
            System.out.println(res);
        }
    }

    private static int helper(int i, int j, int rows, int cols, char[][] arr, int[][] flag) {
        if (i == rows - 1 && j == cols - 1) return 1;
        if (i < 0 || i >= rows || j < 0 || j >= cols || arr[i][j] == '#' || flag[i][j] == 1) return 0;
        flag[i][j] = 1;
        return helper(i + 1, j, rows, cols, arr, flag) //右
                + helper(i, j + 1, rows, cols, arr, flag) //上
                + helper(i, j - 1, rows, cols, arr, flag) //下
                + helper(i - 1, j, rows, cols, arr, flag) //左
                ;
    }
}
