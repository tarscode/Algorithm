package AcmCoder.findMax;

import java.util.Scanner;

/**
 * Created by liuyang on 17/3/3.
 * 题目描述：
 * 小A是某公司的web应用开发人员，最近他在研究这样一个问题。当我们输入一段英语字符串时，
 * 可不可以判断出在这段字符串中哪个字母是其中最大的那个呢？请你帮助小A完成这样一个问题，
 * 如果判断出哪个字母是最大的就在其后面进行标注（max）
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] arr = str.toCharArray();
        char max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }
        StringBuffer sb = new StringBuffer();
        String tag = "(max)";
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            if(arr[i]==max){
                sb.append(tag);
            }
        }
        System.out.print(sb);
    }
}
