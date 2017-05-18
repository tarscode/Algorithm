package baidu.test3;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: baidu.test3 类名: Main
 * 【作者】: Tars
 * 【时间】: 2017/4/27 0027 18:50
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
    public static long total = 0;

    public static int little;

    public static void swap(int[] formuar, int i, int j) {
        int temp = 0;
        temp = formuar[i];
        formuar[i] = formuar[j];
        formuar[j] = temp;
    }

    public static void arrange(int[] formuar, int index, int len) {
        if (index == len - 1) {
            int tmp = getNum(formuar);
            if(tmp==little){
                total++;
                total = total%2017;
            }

        } else {
            for (int i = index; i < len; i++) {
                swap(formuar, index, i);
                arrange(formuar, index + 1, len);
                swap(formuar, index, i);
            }
        }

    }

    public static int getNum(int[] arr){
        int num = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        if(n-1==k){
            System.out.println(1);
        }else {
            little = k;
            int[] formula = new int[n];
            for (int i = 0; i < n; i++) {
                formula[i] = i + 1;
            }
            arrange(formula, 0, formula.length);
            total = total % 2017;
            System.out.println(total);
        }
    }
}

