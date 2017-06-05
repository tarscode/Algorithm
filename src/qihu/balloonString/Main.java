package qihu.balloonString;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: qihu.balloonString 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/6/5 下午7:58
 * 【题目】: 剪气球串
 * 【内容】: 小明买了一些彩色的气球用绳子串在一条线上，想要装饰房间，每个气球都染上了一种颜色，每个气球的形状都是各不相同的。我们用1到9
 * 一共9个数字表示不同的颜色，如12345则表示一串5个颜色各不相同的气球串。但小明希望得到不出现重复颜色的气球串，那么现在小明需要将这个气
 * 球串剪成多个较短的气球串，小明一共有多少种剪法？如原气球串12345的一种是剪法是剪成12和345两个气球串。
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
        int[] arr = new int[n+1]; //气球颜色数组
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int[] map = new int[10];//记录每个颜色气球出现颜色的数目
            for (int j = i; j >= 1; j--) {
                if (map[arr[j]]++ >= 1) { //有颜色重复
                    break;
                }
                dp[i] = (dp[i] + dp[j - 1]) % 1000000007;
            }
        }
        System.out.println(dp[n]);
    }
}