package codem.music;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: codem.music 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/6/11 下午11:12
 * 【题目】: 音乐研究
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: AC
 * 【思路】: 暴力即可
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = in.nextInt();
        }
        long min = Long.MAX_VALUE; //保存最后结果的最小值
        for (int i = 0; i < m - n + 1; i++) {
            long cur = 0;//计算当前最小值
            for (int j = 0; j < n; j++) {
                cur += (arrN[j] - arrM[j + i]) * (arrN[j] - arrM[j + i]);
            }
            min = cur < min ? cur : min;
        }
        System.out.println(min);
    }
}