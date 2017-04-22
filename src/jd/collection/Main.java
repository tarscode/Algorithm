package jd.collection;

import java.util.*;

/**
 * 【工程】: Algorithm 包名: jd.collection 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/5 下午6:59
 * 【题目】: 集合
 * 【内容】: 多组（不超过 5 组）数据。
 *          每组输入数据分为三行，第一行有两个数字 n,m($0＜n,m\leq10000$)，分别表示集合 A 和集合 B 的元素个数。后两行分别表示集合
 *          A 和集合 B。每个元素为不超出 int 范围的整数，每个元素之间有一个空格隔开。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 京东2017秋招
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] res = new int[5][];
        int num = 0;
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr = new int[n + m];
            for (int i = 0; i < n + m; i++) {
                int tmp = in.nextInt();
                arr[i] = tmp;
            }
            res[num] = arr;
            num++;
        }

        for (int i = 0; i < num; i++) {
           int[] cur = res[i];
           Arrays.sort(cur);
           for(int j=0;j<cur.length-1;j++){
               if(cur[j]!=cur[j+1]){
                   System.out.print(cur[j]+" ");
               }else{
                   continue;
               }
           }
            System.out.print(cur[cur.length-1]);
            System.out.println();
        }
    }
}