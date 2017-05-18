package netease.maxsum;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: netease.maxsum 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/15 下午7:19
 * 【题目】: 最大和
 * 【内容】: 在一个N*N的数组中寻找所有横，竖，左上到右下，右上到左下，四种方向的直线连续D个数字的和里面最大的值
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 60%
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cur = in.nextInt();
                arr[i][j] = cur;
            }
        }
        long max = Long.MIN_VALUE;
        //横
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - d; j++) {
                long cur = 0;
                for (int k = 0; k < d; k++) {
                    cur += arr[i][j + k];
                }
                max = Math.max(cur, max);
            }
        }
        //竖
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - d; j++) {
                long cur = 0;
                for (int k = 0; k < d; k++) {
                    cur += arr[j + k][i];
                }
                max = Math.max(cur, max);
            }
        }

        //左上到右下 -> \

        for (int i = 0; i <= n - d; i++) {
            for (int j = 0; j <= n - d; j++) {
                long cur = 0;
                for (int k = 0; k < d; k++) {
                    cur += arr[i + k][j + k];
                }
                max = Math.max(cur, max);
            }
        }

        //右下到坐下 -> /
        for (int i = 0; i < n - d; i++) {
            for (int j = n - d; j < n; j++) {
                long cur = 0;
                for (int k = 0; k < d; k++) {
                    cur += arr[i + k][j - k];
                }
                max = Math.max(cur, max);
            }
        }

        System.out.println(max);
    }
}