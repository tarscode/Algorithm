package huawei.autumn2016.card;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: huawei.autumn2016.card 类名: Poker
 * 【作者】: liuyang
 * 【时间】: 17/6/2 下午9:58
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Poker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] res = s.split("-");
        s = s.replaceAll(" ", "");
        s = s.replaceAll("joker", "w");
        s = s.replaceAll("JOKER", "W");
        s = s.replaceAll("10", "t");
        String[] arr = s.split("-");
        char[] left = arr[0].toCharArray();
        char[] right = arr[1].toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 7; i++) {
            map.put((char) (i + 51), i);
        }
        map.put('t', 7);
        map.put('J', 8);
        map.put('Q', 9);
        map.put('K', 10);
        map.put('A', 11);
        map.put('2', 12);
        map.put('w', 13);
        map.put('W', 14);

        if (joker(left) || joker(right)) { //存在王炸
            System.out.println("joker JOKER");
        } else if (left.length == right.length) {//当左右长度相等的时候
            if (map.get(left[0]) > map.get(right[0]))
                System.out.println(res[0]);
            else
                System.out.println(res[1]);
        } else if (left.length == 4) {
            System.out.println(res[0]);
        } else if (right.length == 4) {
            System.out.println(res[1]);
        } else {
            System.out.println("ERROR");
        }
    }

    private static boolean joker(char[] poker) {
        return poker.length == 2 && poker[0] == 'w' && poker[1] == 'W';
    }
}