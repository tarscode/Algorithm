package didi.autumn2017.restaurant;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

/**
 * 【工程】: Algorithm 包名: didi.autumn2017.restaurant 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/24 下午7:46
 * 【题目】: 餐馆
 * 【内容】: 某餐馆有n张桌子，每张桌子有一个参数：a 可容纳的最大人数； 有m批客人，
 * 每批客人有两个参数:b人数，c预计消费金额。 在不允许拼桌的情况下，请实
 * 现一个算法选择其中一部分客人，使得总预计消费金额最大
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
        int m = in.nextInt();
        int[] a = new int[n];
        int[] flaga = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
            c[i] = in.nextInt();
        }
        sort(c, b, m);
        long res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i] <= a[j]) {
                    res += c[i];
                    a[j] = 0;
                    break;
                }
            }
        }
        System.out.println(res);
    }

    //两数组排序
    private static void sort(int[] A, int[] B, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] < A[j + 1]) {
                    exch(A, j, j + 1);
                    exch(B, j, j + 1);
                }
            }
        }
    }

    private static void exch(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

