package acmcoder.translateMarsLanguage;

import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * 【工程】: Algorithm 包名: acmcoder.translateMarsLanguage 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/3/17 下午7:23
 * 【题目】: 翻译火星文
 * 【内容】: 字典部分以 "START" 开始，以 "END" 结束。中间每行两个单词，左边是英文，右边是火星文，以单个空格隔开。
 * 历史书部分以 "START" 开始，以 "END" 结束。中间若干行火星文，如果单词在字典上出现过，且是火星文，则把它替换成英文；
 * 否则，保留该单词，也保留所有非英文字母的特殊符号。文本长度不超过 10000。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        int flag = 0;//状态标识
        Map<String, String> map = new HashMap<>();
        List<String> list = new LinkedList<>();
        String str;
        while (sc.hasNext()) {
            str = sc.nextLine();
            if (str.equals("START") || str.equals("END")) {
                flag++;
                if (flag == 4) {//已经结束
                    break;
                } else {
                    continue;
                }
            }
            //开始建立字典
            if (flag == 1) {
                String[] arr = str.split(" ");
                map.put(arr[1], arr[0]);
            }
            //开始解析字符串
            if (flag == 3) {
                for (String key : map.keySet()) {
                    str = str.replace(key, map.get(key));
                }
                list.add(str);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(String.valueOf(list.get(i)));
        }
    }
}