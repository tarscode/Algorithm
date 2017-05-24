package didi.autumn2017.maxsum;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: didi.autumn2017.maxsum 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/24 下午7:11
 * 【题目】: 连续子数组的最大和
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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        long[] res = new long[n];
        res[0] = arr[0];
        long max = arr[0];
        for (int i = 1; i < n ; i++) {
            res[i] = Math.max(arr[i],res[i-1]+arr[i]);
            max = Math.max(max,res[i]);
        }
        System.out.println(max);
    }
}