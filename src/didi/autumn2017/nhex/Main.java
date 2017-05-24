package didi.autumn2017.nhex;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: didi.autumn2017.nhex 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/24 下午7:34
 * 【题目】: 进制转换
 * 【内容】: 给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数,
 * 输入为一行，M(32位整数)、N(2 ≤ N ≤ 16)，以空格隔开。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 通过10%,只通过系统函数实现二进制、八进制和十六进制
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String res = null;
        if (n == 2) {
            res = Integer.toBinaryString(m);
        } else if (n == 8) {
            res = Integer.toOctalString(m);
        } else {
            res = Integer.toHexString(m);
        }
        System.out.println(res);
    }
}