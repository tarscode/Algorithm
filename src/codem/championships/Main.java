package codem.championships;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: codem.championships 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/6/12 上午12:10
 * 【题目】: 锦标赛
 * 【内容】: 比赛有 n 个人参加（其中 n 为2的幂），每个参赛者根据资格赛和预赛、复赛的成绩，会有不同的积分。比赛采取锦标赛赛制，分轮次进行，
 * 设某一轮有 m 个人参加，那么参赛者会被分为 m/2 组，每组恰好 2 人，m/2 组的人分别厮杀。我们假定积分高的人肯定获胜，若积分一样，则随机产
 * 生获胜者。获胜者获得参加下一轮的资格，输的人被淘汰。重复这个过程，直至决出冠军。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 题目意思注意理解,两个人比赛胜者进入下一轮，初始为0轮，即求出到第n轮还活着的。
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
        int target = arr[0]; //第一是小美的积分
        Arrays.sort(arr);
        int num = n;
        //计算有多少个小于等于target的人
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] <= target) {
                break;
            }
            num = i;
        }
        int res = 0;//记录比赛次数
        //模拟比赛过程
        int tmp = 2;
        while (tmp <= num) {
            tmp = tmp * 2;
            res = res + 1;
        }
        System.out.println(res);
    }
}