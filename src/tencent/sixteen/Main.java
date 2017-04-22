package tencent.sixteen;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: tencent.sixteen 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/3 下午8:14
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
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if ((i + 1) % 16 == 1) {
                System.out.printf("%08x",i);//十六进制偏移
            }
            String ch = Integer.toHexString(arr[i]);//十六进制字符
            System.out.print("  " + ch);
            if (i != 0 && (i + 1) % 16 == 0) {
                System.out.println("  " + str.substring(i - 15, i + 1));//原文
            }
        }
    }
}