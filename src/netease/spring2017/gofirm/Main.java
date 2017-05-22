package netease.spring2017.gofirm;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: netease.spring2017.gofirm 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/22 下午8:07
 * 【题目】: 赶去公司
 * 【内容】: 终于到周末啦！小易走在市区的街道上准备找朋友聚会，突然服务器发来警报,
 * 小易需要立即回公司修复这个紧急bug。假设市区是一个无限大的区域，每条街
 * 道假设坐标是(X，Y)，小易当前在(0，0)街道，办公室在(gx,gy)街道上。小
 * 易周围有多个出租车打车点，小易赶去办公室有两种选择，一种就是走路去公司，
 * 另外一种就是走到一个出租车打车点，然后从打车点的位置坐出租车去公司。每
 * 次移动到相邻的街道(横向或者纵向)走路将会花费walkTime时间，打车将花费taxiTime
 * 时间。小易需要尽快赶到公司去，现在小易想知道他最快需要花费多少时间去公司。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: AC
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //打车点数目
        int[] tX = new int[n];
        for (int i = 0; i < n; i++) {
            tX[i] = in.nextInt();
        }
        int[] tY = new int[n];
        for (int i = 0; i < n; i++) {
            tY[i] = in.nextInt();
        }
        int targetX = in.nextInt();
        int targetY = in.nextInt();
        int walktime = in.nextInt();
        int taxitime = in.nextInt();
        int min = Math.abs(targetX) * walktime + Math.abs(targetY) * walktime; //不打车，走着去
        for (int i = 0; i < n; i++) {
            int cur = (Math.abs(tX[i])+Math.abs(tY[i]))*walktime+(Math.abs(targetX-tX[i])+Math.abs(targetY-tY[i]))*taxitime;
            min = Math.min(cur,min);
        }
        System.out.println(min);
    }
}