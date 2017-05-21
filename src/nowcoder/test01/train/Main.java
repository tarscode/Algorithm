package nowcoder.test01.train;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: nowcoder.test01.train 类名: Main
 * 【作者】: Tars
 * 【时间】: 2017/5/19 0019 20:02
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

        long res = 0;
        int xmax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int tmp = y - x;
            if(tmp>0){
                res +=tmp;
                if(x>xmax){
                    xmax = x;
                }
            }
        }
            res = res + xmax+xmax;

        System.out.println(res);
    }
}
/*
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        long res = 0;
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            x[i] = a;
            y[i] = b;
            res = Math.max(res+b-a,res);
        }

        int index = getMax(x);
        int xmax = x[index];
        int ymax = y[index];
        if(xmax>ymax){
            res = res + xmax+ymax;
        }

        System.out.println(res);
    }

    public static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
} */