package qihu.expection;

import java.util.Scanner;

/**
 * Created by liuyang on 17/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double sum = 0.0f;
        for (int i = 0; i < num; i++) {
            int xi = in.nextInt();
            int pi = in.nextInt();
            sum = sum + xi * pi*1.0;
        }
        System.out.printf("%.3f", sum/100.0);
    }
}
