package qihu.gole;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: qihu.gole 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/3/18 下午8:27
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
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] man1 = new int[t];
        int[] man2 = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] gold = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                gold[j] = scanner.nextInt();
                sum += gold[j];
            }
            int l = 0;
            int r = n - 1;
            int gold1 = 0;
            int flag = 0;
            while (l < r) {
                if(flag==0) {
                    gold1 += gold[l] > gold[r] ? gold[l] : gold[r];
                    if(gold[l]>gold[r]){
                        l++;
                    }else{
                        r--;
                    }
                    flag=1;
                }else{

                    if(gold[l]>gold[r]){
                        l++;
                    }else{
                        r--;
                    }
                    flag=0;
                }
            }
            man1[i] = Math.max(gold1,sum-gold1);
            man2[i] = Math.min(gold1,sum-gold1);
        }
        for(int i=0;i<t;i++){
            System.out.print("Case #");
            System.out.print(i+1);
            System.out.print(": ");
            System.out.print(man1[i]);
            System.out.print(" ");
            System.out.println(man2[i]);
        }
    }
}