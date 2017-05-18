package baidu.test2;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: baidu.test2 类名: Main
 * 【作者】: Tars
 * 【时间】: 2017/4/27 0027 18:50
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
        if (n <= 50) {
            int[][] r = new int[n][];
            int[][] g = new int[n][];
            int[][] b = new int[n][];
            int lenr = -1;
            int leng = -1;
            int lenb = -1;
            for (int i = 0; i < n; i++) {
                String flag = in.next();
                int[] tmp = new int[3];
                tmp[0] = in.nextInt();
                tmp[1] = in.nextInt();
                tmp[2] = in.nextInt();
                if (flag.equals("R")) {
                    lenr++;
                    r[lenr] = tmp;
                }
                if (flag.equals("G")) {
                    leng++;
                    g[leng] = tmp;
                }
                if (flag.equals("B")) {
                    lenb++;
                    b[lenb] = tmp;
                }
            }

            double max = 0;
            if (lenr >= 2) {
                double rs = getMax(r, lenr);
                max = Math.max(max, rs);
            }
            if (leng >= 2) {
                double rg = getMax(g, leng);
                max = Math.max(max, rg);
            }
            if (lenb >= 2) {
                double rb = getMax(b, lenb);
                max = Math.max(max, rb);
            }
            //计算三个颜色面积最大值
            if (lenr >= 0 && leng >= 0 && lenb >= 0) {
                for (int i = 0; i <= lenr; i++) {
                    for (int j = 0; j <= leng; j++) {
                        for (int k = 0; k <= lenb; k++) {
                            double[] line = getLine(r[i], g[j], b[k]);
                            double cur = getArea(line);
                            max = Math.max(cur, max);
                        }
                    }
                }
            }
            //System.out.println(max);
            System.out.printf("%.5f", max);
        } else {
            System.out.printf("%.5f", 0.0);
        }
    }

    private static double[] getLine(int[] a, int[] b, int[] c) {
        double l1 = Math.sqrt((a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]) + (a[2] - b[2]) * (a[2] - b[2]));
        double l2 = Math.sqrt((a[0] - c[0]) * (a[0] - c[0]) + (a[1] - c[1]) * (a[1] - c[1]) + (a[2] - c[2]) * (a[2] - c[2]));
        double l3 = Math.sqrt((c[0] - b[0]) * (c[0] - b[0]) + (c[1] - b[1]) * (c[1] - b[1]) + (c[2] - b[2]) * (c[2] - b[2]));
        return new double[]{l1, l2, l3};
    }

    //根据边长计算三角形面积
    private static double getArea(double[] arr) {
        double p = (arr[0] + arr[1] + arr[2]) / 2;
        double s = Math.sqrt(p * (p - arr[0]) * (p - arr[1]) * (p - arr[2]));
        return s;
    }

    //计算一个颜色的面积最大值
    private static double getMax(int[][] arr, int n) {
        double max = 0;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                for (int k = j + 1; k <= n; k++) {
                    double[] line = getLine(arr[i], arr[j], arr[k]);
                    double cur = getArea(line);
                    max = Math.max(cur, max);
                }
            }
        }
        return max;
    }
}
