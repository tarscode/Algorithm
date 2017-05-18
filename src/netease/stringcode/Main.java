package netease.stringcode;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: netease.stringcode 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/15 下午7:00
 * 【题目】: 字符串编码
 * 【内容】: 给定一个字符串，请你将字符串重新编码，将连续的字符替换成“连续出现的个数+字符”。比如字符串AAAABCCDAA会被编码成4A1B2C1D2A
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: AC
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] arr = str.toCharArray();
        int left = 0;
        String code = "";
        while(left<arr.length){
            String cur = String.valueOf(arr[left]);
            int right = getNextChar(arr,left);
            int len = right-left; //记录重复字符数目
            code +=len+cur;
            left=right;
        }

        System.out.println(code);
    }

    //计算下一次出现不一样字符的位置
    public static int getNextChar(char[] arr,int i){
        char cur = arr[i];
        while(i<arr.length&&arr[i]==cur){
            i++;
        }
        return i;
    }
}