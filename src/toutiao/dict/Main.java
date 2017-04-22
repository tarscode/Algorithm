package toutiao.dict;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: toutiao.dict 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/3/29 下午8:15
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 暴力超时过20%
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] arr = new String[n];
        for (int i = 1; i <= n; i++) {
            arr[i-1] = String.valueOf(i);
        }
        Arrays.sort(arr);
        System.out.println(arr[m-1]);
    }
}