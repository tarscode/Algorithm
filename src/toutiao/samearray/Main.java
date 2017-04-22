package toutiao.samearray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: toutiao.samearray 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/18 下午7:36
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
        int m = in.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int num = in.nextInt();
            map.put(num, 1);
        }
        int n = in.nextInt();
        for (int j = 0; j < n; j++) {
            int num = in.nextInt();
            if (map.containsKey(num)) {
               // if (map.get(num) == 1) {
                System.out.print(num + " ");
                //    map.put(num, 0);
                //}
            }
        }
    }
}