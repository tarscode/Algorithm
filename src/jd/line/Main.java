package jd.line;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: jd.line 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/7 下午11:43
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
        String str = in.next();
        char[] arr = str.toCharArray();
        int[] flag = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'X' || arr[i] == '#') {
                continue;
            }
            int x = Integer.parseInt(String.valueOf(arr[i]));
            for (; x > 0; x--) {
                if (i - x >= 0) {
                    flag[i-x] = 1;
                }
                if (i + x < n) {
                    flag[i+x] = 1;
                }
            }
        }
        int num = 0;
        for (int i =0;i<n;i++) {
            if(flag[i]==1&&arr[i]=='X'){
                num++;
            }
        }
        System.out.println(num);
    }
}