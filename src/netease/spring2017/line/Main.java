package netease.spring2017.line;

/**
 * 【工程】: Algorithm 包名: netease.spring2017.line 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/22 下午9:15
 * 【题目】: 调整队形
 * 【内容】: 在幼儿园有n个小朋友排列为一个队伍，从左到右一个挨着一个编号为(0~n-1)。
 * 其中有一些是男生，有一些是女生，男生用'B'表示，女生用'G'表示。小朋友们
 * 都很顽皮，当一个男生挨着的是女生的时候就会发生矛盾。作为幼儿园的老师，
 * 你需要让男生挨着女生或者女生挨着男生的情况最少。你只能在原队形上进行调
 * 整，每次调整只能让相邻的两个小朋友交换位置，现在需要尽快完成队伍调整，
 * 你需要计算出最少需要调整多少次可以让上述情况最少。例如：
 * GGBBG -> GGBGB -> GGGBB这样就使之前的两处男女相邻变为一处相邻，需要
 * 调整队形2次
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] arr = str.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        int num = 0;
        //第一种情况先女生后男生
        while (l < r) {
            //找到左边第一个需要交换的位置
            while (l < r && arr[l] != 'B') {
                l++;
            }
            //找到右边第一个需要交换的位置
            while (r > l && arr[r] != 'G') {
                r--;
            }
            if (l < r) {
                num = num + r - l;
                l++;
                r--;
            }
        }
        l = 0;
        r = arr.length - 1;
        int num2 = 0;
        //第二种情况先男生后女生
        while (l < r) {
            //找到左边第一个需要交换的位置
            while (l < r && arr[l] != 'G') {
                l++;
            }
            //找到右边第一个需要交换的位置
            while (r > l && arr[r] != 'B') {
                r--;
            }
            if (l < r) {
                num2 = num2 + r - l;
                l++;
                r--;
            }
        }
        int res = Math.min(num, num2);
        System.out.println(res);
    }
}