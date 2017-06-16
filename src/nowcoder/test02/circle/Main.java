package nowcoder.test02.circle;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: nowcoder.test02.circle 类名: Main
 * 【作者】: Tars
 * 【时间】: 2017/6/16 0016 19:49
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: AC50%
 * 【思路】:
 */
public class Main {

    //private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int min = arr[n-1]-arr[0];

        for(int i=0;i<n-1;i++){
            int a = arr[i+1]-arr[0];
            int b = arr[n-1]-arr[i];
            int cur = Math.max(a,b);
            min = Math.min(cur,min);
        }

        System.out.println(min);
    }

    /*
    public static int min(int[] arr){
        int min = 0;
        for(int i=0;i<arr.length-1;i++){
            int cur = Math.max(arr[i]-arr[i+1],arr[i+1]-arr[i]);
            min = Math.max(cur,min);
        }
        int tmp = Math.max(arr[0]-arr[arr.length-1],arr[arr.length-1]-arr[0]);
        min = Math.max(tmp,min);
        return min;
    }


    public static void permutation(int[] arr, int first, int end) {

        //输出一个排列方式
        if (first == end) {
            int cur = min(arr);
            min = Math.min(cur,min);
        }
        //遍历全部情况
        for (int i = first; i <= end; i++) {
            exch(arr, i, first);
            permutation(arr, first + 1, end);  //固定好当前一位，继续排列后面的
            exch(arr, i, first);
        }
    }

    public static void exch(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
    */
}
