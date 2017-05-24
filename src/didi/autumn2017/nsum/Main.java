package didi.autumn2017.nsum;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: didi.autumn2017.nsum 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/24 下午7:43
 * 【题目】: 数字和为sum的方法数
 * 【内容】: 给定一个有n个正整数的数组A和一个整数sum,求选择数组A中部分数字和为sum的方案数。
 * 当两种选取方案有一个数字的下标不一样,我们就认为是不同的组成方案。
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
        int sum = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
    }
}