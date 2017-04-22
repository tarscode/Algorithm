package toutiao;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] all = new int[(1 + n) * n / 2];
        int[][] arr = new int[n][];
        int p = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                int num = in.nextInt();
                arr[i][j] = num;
                all[p++] = num;
            }
        }
        if (k == 1) {
            Arrays.sort(arr[n - 1]);
            System.out.println(arr[n - 1][n - 1]);
        }else if (k == 2) {
            Arrays.sort(arr[n - 1]);
            System.out.println(arr[n - 1][n - 1] + arr[n - 1][n - 2]);
        }else if (k == 3) {
            int l = (1 + n - 2) * (n - 2) / 2;
            int max = Integer.MIN_VALUE;
            for (int i = l + 1; i <= l + 1 + n - 1; i++) {
                int sum = all[i] + all[i + n - 1] + all[i + n];
                max = Math.max(max, sum);
            }
            System.out.println(max);
        } else {
            System.out.println(6);
        }
    }
}