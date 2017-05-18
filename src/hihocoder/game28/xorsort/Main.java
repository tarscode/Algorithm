package hihocoder.game28.xorsort;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: hihocoder.game28.xorsort 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/23 下午7:03
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            long s = in.nextLong();
            arr[i] = s;
        }
        long max = (long) Math.pow(2, 60);
        System.out.println(max);
        long num = 0;
        for (int i = 0; i < n - 1; i++) {
            for (long j = 0; j < max; j++) {
                long res1 = arr[i] ^ j;
                long res2 = arr[i + 1] ^ j;
                if (res1 <= res2) {
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}