package nowcoder.test02.cow;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: nowcoder.test02.cow 类名: Main
 * 【作者】: Tars
 * 【时间】: 2017/6/16 0016 19:40
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 内存超了
 * 【思路】:
 */
public class Main {

    private static ArrayList<Integer> tmpArr = new ArrayList<>();
    private static long res = 0;
    private static int num;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        num = n;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        combine(0, k, arr);
        System.out.println(res);
    }

    public static void combine(int index, int k, int[] arr) {
        if (k == 1) {
            for (int i = index; i < arr.length; i++) {
                tmpArr.add(arr[i]);
                long cur = 0;
                for (int j : tmpArr) {
                    cur += j;
                }
                if (cur % num == 0) {
                    res = (res + 1) % 1000000007;
                }
                tmpArr.remove((Object) arr[i]);
            }
        } else if (k > 1) {
            for (int i = index; i <= arr.length - k; i++) {
                tmpArr.add(arr[i]);
                combine(i + 1, k - 1, arr);
                tmpArr.remove((Object) arr[i]);
            }
        } else {
            return;
        }
    }
}
