package netease.leihuo2017.racing;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: netease.racing 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/15 下午7:54
 * 【题目】: 赛马
 * 【内容】: 在一条无限长的跑道上，有N匹马在不同的位置上出发开始赛马。当开始赛马比赛后，所有的马开始以自己的速度一直匀速前进。每匹马的速
 * 度都不一样，且全部是同样的均匀随机分布。在比赛中当某匹马追上了前面的某匹马时，被追上的马就出局。 请问按以上的规则比赛无限长的时间后，
 * 赛道上剩余的马匹数量的数学期望是多少
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Main {

    private static int num = 0;
    private static long res = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        permutation(arr, 0, n - 1);
        float exp = (float) (res*1.0 / num*1.0);
        System.out.printf("%.4f", exp);
    }

    public static void permutation(int[] arr, int first, int end) {
        //输出str[first..end]的所有排列方式
        if (first == end) {    //输出一个排列方式
            int[] tmp = Arrays.copyOf(arr, arr.length);
            for (int i = 0; i < tmp.length; i++) {
                for (int j = i + 1; j < tmp.length; j++) {
                    if (tmp[i] == 0) {
                        break;
                    }
                    if (tmp[i] > tmp[j]) {
                        tmp[j] = 0;
                    }
                }
            }
            int cur = 0;
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] != 0) {
                    cur++;
                }
            }
            num++;
            res = res + cur;
        }

        for (int i = first; i <= end; i++) {
            swap(arr, i, first);
            permutation(arr, first + 1, end);  //固定好当前一位，继续排列后面的
            swap(arr, i, first);
        }
    }

    private static void swap(int[] arr, int i, int first) {
        int tmp;
        tmp = arr[first];
        arr[first] = arr[i];
        arr[i] = tmp;
    }

}