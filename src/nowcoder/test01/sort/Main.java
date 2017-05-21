package nowcoder.test01.sort;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: nowcoder.test01.sort 类名: Main
 * 【作者】: Tars
 * 【时间】: 2017/5/19 0019 20:29
 * 【题目】: 排序子序列
 * 【内容】: 牛牛定义排序子序列为一个数组中一段连续的子序列,并且这段子序列是非递增或者非递减排序的。
 *          牛牛有一个长度为n的整数数组A,他现在有一个任务是把数组A分为若干段排序子序列,牛牛想知道
 *          他最少可以把这个数组分为几段排序子序列.如样例所示,牛牛可以把数组A划分为[1,2,3]和[2,2,1]
 *          两个排序子序列,至少需要划分为2个排序子序列,所以输出2
 *
 *          输入描述:
 *          输入的第一行为一个正整数n(1 ≤ n ≤ 10^5
 *          第二行包括n个整数A_i(1 ≤ A_i ≤ 10^9),表示数组A的每个数字。
 *
 *          输出描述:
 *          输出一个整数表示牛牛可以将A最少划分为多少段排序子序列
 *
 *          输入例子:
 *          6
 *          1 2 3 2 2 1
 *
 *          输出例子:
 *          2
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */

public class Main {
    private static boolean flag = false;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i <= n-1; i++) {
            num[i] = in.nextInt();
        }
        int res = 0;
        for (int i = 1; i <= n-1; i++) {
            if (i == 1)
                i= help(num, i, n);
            if (flag){
                if (i < n && num[i-1] > num[i]){
                    res++;
                    i++;
                    i= help(num, i, n);
                }
            }else{
                if (i < n && num[i-1] < num[i]){
                    res++;
                    i++;
                    i= help(num, i, n);
                }
            }
        }
        res++;
        System.out.println(res);
    }
    private static int help (int[] num, int i, int n){
        while(i < n && num[i] == num[i-1]){
            i++;
        }
        if (i < n && num[i - 1] < num[i])
            flag = true;
        else if (i < n && num[i - 1] > num[i])
            flag = false;
        return i;
    }
}
