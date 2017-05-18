package aiqiyi.playnumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: aiqiyi.playnumer 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/14 下午8:26
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 通过75%,内存超出限制
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cap = in.nextInt();
        List<Integer> wlist = new ArrayList<>();
        List<Integer> vlist = new ArrayList<>();
        while(in.hasNextInt()){
            int w = in.nextInt();
            int v = in.nextInt();
            wlist.add(w);
            vlist.add(v);
        }
        int[] w = list2Array(wlist);
        int[] v = list2Array(vlist);
        int n = w.length;
        int res = maxValue(w,v,n,cap);
        System.out.println(res);
    }

    public static int[] list2Array(List<Integer> list){
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static int maxValue(int[] w, int[] v, int n, int cap) {
        int dp[][] = new int[n+1][cap+1];
        //初始化背包为0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        //初始化物品为0
        for (int j = 0; j <= cap; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= cap; j++) {
                if (w[i-1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i-1]] + v[i-1]);
                }
            }
        }
        return dp[n][cap];
    }
}