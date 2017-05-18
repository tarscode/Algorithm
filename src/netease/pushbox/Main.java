package netease.pushbox;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: netease.pushbox 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/15 下午7:48
 * 【题目】: 推箱子
 * 【内容】: 大家一定玩过“推箱子”这个经典的游戏。具体规则就是在一个N*M的地图上，有1个玩家、1个箱子、1个目的地以及若干障碍，其余是空地。
 * 玩家可以往上下左右4个方向移动，但是不能移动出地图或者移动到障碍里去。如果往这个方向移动推到了箱子，箱子也会按这个方向移动一格，当然，
 * 箱子也不能被推出地图或推到障碍里。当箱子被推到目的地以后，游戏目标达成。现在告诉你游戏开始是初始的地图布局，请你求出玩家最少需要移动
 * 多少步才能够将游戏目标达成。
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
        int m = in.nextInt();
        char[][] arr = new char[n][];
        for (int i = 0; i < n; i++) {
            String str = in.next();
            arr[i] = str.toCharArray();
        }
        int res = -1;
        System.out.println(res);

    }
}