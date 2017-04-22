package toutiao.xor;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: toutiao.xor 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/3/29 下午7:54
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 暴力30%
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long tmp = arr[i] ^ arr[j];
                if (tmp > m) {
                    num++;
                }
            }
        }
        System.out.print(num);
    }
}