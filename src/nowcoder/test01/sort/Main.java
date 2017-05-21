package nowcoder.test01.sort;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: nowcoder.test01.sort 类名: Main
 * 【作者】: Tars
 * 【时间】: 2017/5/19 0019 20:29
 * 【题目】:
 * 【内容】:
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
