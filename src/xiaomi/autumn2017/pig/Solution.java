package xiaomi.autumn2017.pig;

/**
 * 【工程】: Algorithm 包名: xiaomi.autumn2017.pig 类名: Solution
 * 【作者】: liuyang
 * 【时间】: 17/5/31 下午7:34
 * 【题目】: 风口上的猪
 * 【内容】: 风口之下，猪都能飞。当今中国股市牛市，真可谓“错过等七年”。
 * 给你一个回顾历史的机会，已知一支股票连续n天的价格走势，以长度为n的整
 * 数数组表示，数组中第i个元素（prices[i]）代表该股票第i天的股价。 假
 * 设你一开始没有股票，但有至多两次买入1股而后卖出1股的机会，并且买入前
 * 一定要先保证手上没有股票。若两次交易机会都放弃，收益为0。 设计算法，
 * 计算你能获得的最大收益。 输入数值范围：2<=n<=100,0<=prices[i]<=100
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: LeetCode原题
 * 【思路】: 考虑三种情况:(1)交易1次(2)交易2次(3)交易0次
 */
public class Solution {

    /**
     * 计算你能获得的最大收益
     *
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public int calculateMax(int[] prices) {
        int n = prices.length;
        int res = 0; //记录收益结果的最大值
        int min = prices[0]; //记录价格的最小值
        int[] left = new int[n];
        int[] right = new int[n]; //从右向左遍历,记录后天的最大收益
        //从左向右遍历,记录前i天的最大收益
        for (int i = 0; i < n; i++) {
            int cur = prices[i] - min;
            res = Math.max(res, cur);
            left[i] = res;
            min = Math.min(prices[i], min);
        }
        int max = prices[n - 1];
        res = 0; //清空变量
        for (int i = n - 1; i >= 0; i--) {
            int cur = max - prices[i];
            res = Math.max(cur, res);
            right[i] = res;
            max = Math.max(max, prices[i]);
        }
        for (int i = 0; i < n; i++) {
            int cur = left[i] + right[i];
            res = Math.max(res, cur);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        int[] arr = {3, 8, 5, 1, 7, 8};
        System.out.println(t.calculateMax(arr));
    }
}