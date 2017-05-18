package aiqiyi.kpart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: aiqiyi.kpart 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/14 下午8:13
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
        int k = in.nextInt();
        List<Integer> list = new ArrayList<>();
        int max = 0;
        while (in.hasNextInt()) {
            int cur = in.nextInt();
            max = cur > max ? cur : max;
            list.add(cur);
        }
        list.sort(Comparator.naturalOrder());
        int n = list.size();
        int len = 0;
        for (int i = 1; i < max; i++) {
            int num = 0;
            for (int cur : list) {
                num = num + cur / i;
            }
            if (num >= k) {
                len = i;
            }
        }
        System.out.println(len);
    }
}