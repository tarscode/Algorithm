package huawei.autumn2016.maxscore;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: huawei.autumn2016.card 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/6/2 下午6:51
 * 【题目】: 最高分多少
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 注意多组输出,加上while(in.hastNext())
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) { //注意处理多组数据
            int n = in.nextInt(); //学生数目
            int m = in.nextInt(); //操作数目
            int[] arr = new int[n + 1]; //学生成绩数组
            arr[0] = 0;
            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextInt();
            }
            for (int i = 0; i < m; i++) {
                String str = in.next();
                int A = in.nextInt();
                int B = in.nextInt();
                if (str.equals("Q")) { //查询id从A到B的最大值
                    int max = Integer.MIN_VALUE;
                    int begin = Math.min(A, B); //处理A和B的大小逆序情况
                    int end = Math.max(A, B);
                    for (int j = begin; j <= end; j++) {
                        max = Math.max(max, arr[j]);
                    }
                    System.out.println(max);
                }
                if (str.equals("U")) {
                    arr[A] = B; //更新操作
                }
            }
        }
    }
}