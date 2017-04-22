package qunar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: qunar 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/2 下午6:31
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
        long[] arr = new long[n];
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int min = 5;
            double avg;
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                int cur = in.nextInt();
                min = Math.min(min, cur);
                sum += cur;
            }
            avg = sum * 1.0 / 5;
            int mid = (int) (avg * 10000 / 10);
            arr[i] = min * 10000000000l + mid * 1000000 + 10000-i;
            map.put(arr[i], i);
        }
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(map.get(arr[i]));
            if (i != 0) {
                System.out.print(' ');
            }
        }
    }
}