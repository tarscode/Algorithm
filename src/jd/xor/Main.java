package jd.xor;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: jd.xor 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/8 上午9:38
 * 【题目】: 异或（京东2017实习生真题）
 * 【内容】: 现在输入两个n位二进制数，输出它们异或结果的十进制答案。上述样例中异或的二进制结果为1000，转化成十进制就是8。
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
        while (in.hasNextInt()) {
            int n = in.nextInt();
            String str1 = in.next();
            String str2 = in.next();
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            String res = "";
            for(int i=0;i<n;i++){
                if(arr1[i]==arr2[i]){
                    res+="0";
                }else{
                    res+="1";
                }
            }
            BigInteger src = new BigInteger(res, 2); //构造BigInteger

            System.out.println(src.toString()); //转换为10进制
        }
    }
}