package toutiao.recruitment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: toutiao.recruitment 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/3/29 下午7:17
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 贪心暴力AC
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int[] flag = new int[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            if(flag[i]==1){
                continue;
            }
            int b = find(arr, flag, i);
            if (b == -1) {
                num = num + 2;
                continue;
            }
            int c = find(arr, flag, b);
            if (c == -1) {
                num = num + 1;
            }

        }
        System.out.print(num);
    }

    public static int find(int[] arr, int[] flag, int begin) {
        for (int i = begin + 1; i < arr.length; i++) {
            if (flag[i] == 1) {
                continue;
            }
            if (flag[i] == 0 && arr[i] - arr[begin] <= 10) {
                flag[i] = 1;
                return i;
            }
        }
        return -1;
    }
}