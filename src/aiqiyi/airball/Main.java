package aiqiyi.airball;

import java.util.*;

/**
 * 【工程】: Algorithm 包名: aiqiyi.airball 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/14 下午9:38
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mark = new int[n];
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            mark[i] = temp;
            list.add(temp);
        }
        Arrays.sort(mark);
        int res = 0;

        for (int i = 0; i < n; i++) {
            int num = mark[i];
            int cur;
            int beforenum = 1;
            int next;
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                cur = it.next();
                if (cur == num) {
                    it.remove();
                    if (!it.hasNext()) {
                        next = 1;
                    } else {
                        next = it.next();
                    }
                    res += next * beforenum * cur;
                    break;
                }
                beforenum = cur;
            }
        }
        System.out.println(res);

    }

}