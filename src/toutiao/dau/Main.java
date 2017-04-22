package toutiao.dau;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 【工程】: Algorithm 包名: toutiao.dau 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/18 下午7:07
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
        Set<Long> set = new HashSet<>();
        while (in.hasNext()){
            long num = in.nextLong();
            if(num==0l){
                break;
            }
            set.add(num);
        }
        System.out.println(set.size());
    }
}