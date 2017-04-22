package toutiao.stringshifting;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: toutiao.stringshifting 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/3/29 下午8:01
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: 暴力40%
 * 【思路】:
 */
public class Main {

    //方法一：暴力法
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            String shiftString = shift(str, i);
            if (str.equals(shiftString)) {
                num++;
            }
        }
        System.out.print(num);
    }

    public static String shift(String str, int i) {
        String left = str.substring(0, i);
        String right = str.substring(i, str.length());
        return right + left;
    }
    */

    //方法二：50%
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] arr = str.toCharArray();
        int n = str.length();
        int num = 0;
        int[] map = new int[n];
        for (int i = 1; i < n; i++) {
            if (arr[0] == arr[i]) {
                map[i] = 1;
            }
        }
        int len = 0;
        label:
        for (int i = 0; i < n; i++) {
            if (map[i] == 1) {
                int l = 0;
                int r = i;
                while (l < n && l != r) {
                    if (l == i) {
                        len = i;
                        if(check(arr,len)){
                            break label;
                        }else{
                            break;
                        }
                    }
                    if (arr[l] != arr[r]) {
                        break;
                    }
                    l++;
                    r++;
                }
            }
        }
        num = n / len;
        System.out.print(num);
    }

    public static boolean check(char[] arr,int len){
        for(int i=0;i<arr.length;i++){
            int tmp = i%len;
            if(arr[tmp]!=arr[i]){
                break;
            }
            return true;
        }
        return false;
    }
}