package jd.shoplist;

import java.util.*;

/**
 * 【工程】: Algorithm 包名: jd.shoplist 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/5 下午7:47
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
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr = new int[n];
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            for (int i = 0; i < m; i++) {
                String str = in.next();
                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                } else {
                    map.put(str, 1);
                }
            }
        }
    }
}