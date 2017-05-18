package jd.election;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: jd.election 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/6 下午8:00
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
/*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
           // PriorityQueue<Integer> queue = new PriorityQueue(Comparator.reverseOrder());
            int target = in.nextInt();
            for (int i = 0; i < n - 1; i++) {
                queue.add(in.nextInt());
            }
            int num = 0; //记录选票数
            while (target <= queue.peek()) { //取出候选人中票数最多的比较
                target++;
                num++;
                int tmp = queue.poll() - 1;
                queue.add(tmp);
            }
            System.out.println(num);
        }

    }
    */
}