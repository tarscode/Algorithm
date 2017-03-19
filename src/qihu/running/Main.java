package qihu.running;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: qihu.running 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/3/18 下午8:02
 * 【题目】: 跑步
 * 【内容】: 小明同学喜欢体育锻炼，他常常去操场上跑步。跑道是一个圆形，在本题中，我们认为跑道是一个半径为R的圆形，设圆心的坐标为原点(0,0)。
 *          小明跑步的起点坐标为(R,0)，他沿着圆形跑道跑步，而且一直沿着一个方向跑步。回到家后，他查看了自己的计步器，计步器显示他跑步的总路程为L。
 *          小明想知道自己结束跑步时的坐标，但是他忘记自己是沿着顺时针方向还是逆时针方向跑的了。他想知道在这两种情况下的答案分别是多少。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 注意格式化输出，最后输出的四舍五入
 * 【思路】:
 *  几何问题，x相同y相反
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l, r;
        l = scanner.nextInt();
        r = scanner.nextInt();
        double PI = Math.PI;
        double length = 2 * PI * r;
        double length2 = l % length;
        double x1 = r * Math.cos(2 * PI * length2 / length);
        double y1 = (-1)*r * Math.sin(2 * PI * length2 / length);
        double y2 = (-1)*y1;
        System.out.printf("%.3f %.3f\n",x1,y1);
        System.out.printf("%.3f %.3f\n",x1,y2);
    }
}