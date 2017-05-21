package nowcoder.test01.team;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: nowcoder.test01.team 类名: Main
 * 【作者】: Tars
 * 【时间】: 2017/5/19 0019 19:33
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 注意long
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n*3];
        int[] res = new int[n*3];
        for(int i=0;i<n*3;i++){
            int cur = in.nextInt();
            arr[i] = cur;
        }
        Arrays.sort(arr);
        for(int i=0;i<n*3;i++){
            res[n*3-i-1]=arr[i];
        }
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += res[2*i+1];
        }
        System.out.println(sum);
    }
}
