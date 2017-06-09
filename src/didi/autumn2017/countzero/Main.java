package didi.autumn2017.countzero;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: didi.autumn2017.countzero 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/24 下午7:17
 * 【题目】: 末尾0的个数
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 100%
 * 【思路】:
 * 大数计算较为耗时，只保留后两位有效数字进行截断处理
 */
public class Main {

    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long res = 1;
        int num = 0;
        for (int i = 1; i <= n; i++) {
            res = res * i;
            int flag = (int) (res % 10);
            //以0结尾的数字处理
            while (flag == 0) {
                res = res / 10;
                num++;
                flag = (int) (res % 10);
            }
            //超过3位的数字截取后两位处理
            if (res > 1000) {
                String str = String.valueOf(res);
                String tmp = str.substring(str.length() - 2, str.length());
                res = Long.valueOf(tmp);
            }
        }
        System.out.println(num);
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = getNuberOfZero(n);
        System.out.println(res);
    }

    //求n!结尾0的个数
    public static int getNuberOfZero(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            int cur = i;
            while (cur % 5 == 0) {
                cur = cur / 5;
                num++;
            }
        }
        return num;
    }
}