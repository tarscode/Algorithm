package qihu.gold;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: qihu.gold 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/3/18 下午8:27
 * 【题目】: 分金子（360公司2017春招真题）
 * 【内容】: A、B两伙马贼意外地在一片沙漠中发现了一处金矿，双方都想独占金矿，但各自的实力都不足以吞下对方，
 * 经过谈判后，双方同意用一个公平的方式来处理这片金矿。处理的规则如下：他们把整个金矿分成n段，由
 * A、B开始轮流从最左端或最右端占据一段，直到分完为止。马贼A想提前知道他们能分到多少金子，因此请
 * 你帮忙计算他们最后各自拥有多少金子?（两伙马贼均会采取对己方有利的策略）
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 40%
 *          http://exercise.acmcoder.com/online/online_judge_ques?ques_id=3863&konwledgeId=42
 * 【思路】:
 */
public class Main {

    //给定数组计算胜者得到的分数
    public static int win2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int n = arr.length;
        int[][] f = new int[n][n];
        int[][] s = new int[n][n];
        for (int j = 0; j < arr.length; j++) {
            f[j][j] = arr[j];
            for (int i = j - 1; i >= 0; i--) {
                f[i][j] = Math.max(arr[i] + s[i + 1][j], arr[j] + s[i][j - 1]);
                s[i][j] = Math.min(f[i + 1][j], f[i][j - 1]);
            }
        }
        return Math.max(f[0][arr.length - 1], s[0][arr.length - 1]);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] manA = new int[t];
        int[] manB = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] gold = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                gold[j] = scanner.nextInt();
                sum += gold[j];
            }
            int goldA = win2(gold);
            int goldB = sum - goldA;
            manA[i] = goldA;
            manB[i] = goldB;
        }
        for(int i=0;i<t;i++){
            System.out.println(String.format("Case #%d: %d %d", i+1, manA[i],manB[i]));
        }
    }
}