package toutiao.numberline;

import java.util.Scanner;

/**
 * Created by liuyang on 17/3/30.
 * 过30%暴力
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        int[] arr1 = new int[q];
        int[] arr2 = new int[q];
        for (int i = 0; i < n; i++) {
            arrA[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrB[i] = in.nextInt();
        }
        for (int i = 0; i < q; i++) {
            arr1[i] = in.nextInt();
            arr2[i] = in.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int num = 0;
            for (int j = 0; j < n; j++) {
                if (arrA[j] >= arr1[i] && arrB[j] >= arr2[i]) {
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
