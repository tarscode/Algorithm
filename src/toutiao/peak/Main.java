package toutiao.peak;

import java.util.Scanner;

/**
 * Created by liuyang on 17/3/30.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] peak = new int[n];
        int max = 0;
        int left = 0;
        int right = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peak[i] = 1;
            }
        }
    }

    public static int[] range(int[] arr, int k) {
        int num = 0;
        int left = k;
        int right = k;
        for (left = left - 1; left >= 0; left--) {
        }
        return new int[]{num,left,right};
    }
}
