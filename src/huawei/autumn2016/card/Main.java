package huawei.autumn2016.card;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: huawei.autumn2016.wrong 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/6/2 下午7:17
 * 【题目】: 简单错误记录
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
        String str = in.nextLine();
        String[] arr = str.split("-");
        String[] card1 = arr[0].split(" ");
        String[] card2 = arr[1].split(" ");
        int[] res1 = getType(card1);
        int[] res2 = getType(card2);
        int type1 = Integer.valueOf(res1[0]);
        int type2 = Integer.valueOf(res2[0]);
        if (type1 == 6 || type2 == 6) {
            System.out.println("joker JOKER");
        } else if (type1 == 4 && type2 != 4) {
            System.out.println(arr[0]);
        } else if (type1 != 4 && type2 == 4) {
            System.out.println(arr[1]);
        } else if (type1 != type2) {
            System.out.println("ERROR");
        } else if (type1==type2) {
            if(res1[1]>res2[1]){
                System.out.println(arr[0]);
            }else{
                System.out.println(arr[1]);
            }
        } else if (res1[1] > res2[1]) {
            System.out.println(arr[0]);
        } else {
            System.out.println(arr[1]);
        }
    }

    //获取牌面类型
    private static int[] getType(String[] arr) {
        int[] res = {1, 3}; //返回结果:类型和值
        int n = arr.length;

        //王炸
        for (int i = 0; i < n; i++) {
            if (arr[i].equals("joker")) {
                for (int j = 0; j < n; j++) {
                    if (arr[j].equals("JOKER")) {
                        res[0] = 6;
                        return res;
                    }
                }
            }
        }


        //更新数组
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            int cur = 0;
            if (arr[i].equals("J")) {
                cur = 11;
            }else if (arr[i].equals("Q")) {
                cur = 12;
            }else if (arr[i].equals("K")) {
                cur = 13;
            }else if (arr[i].equals("A")) {
                cur = 14;
            }else if (arr[i].equals("2")) {
                cur = 16;
            }else if (arr[i].equals("joker")) {
                cur = 17;
            }else if (arr[i].equals("JOKER")) {
                cur = 18;
            }else{
                cur = Integer.valueOf(arr[i]);
            }
            copy[i] = cur;
        }

        //建立map,统计各个数量
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(copy[i])) {
                map.put(copy[i], map.get(copy[i]) + 1);
            } else {
                map.put(copy[i], 1);
            }
        }

        //判断1、2、3、4条
        for (int i = 0; i < n; i++) {
            if (map.get(copy[i]) > res[0]) {
                res[0] = map.get(copy[i]);
                res[1] = copy[i];
            }
            if (map.get(copy[i]) == res[0]) {
                res[1] = Math.max(res[1], copy[i]);
            }
        }

        //3条以上直接返回
        if (res[0] >= 3) {
            return res;
        }

        //判断顺子
        int num = 0;
        for (int i = 0; i < n - 1; i++) {
            if (copy[i] + 1 == copy[i + 1]) {
                num++;
            }
        }
        if (num == 4) {
            res[0] = 5;
            res[1] = copy[0];
        }
        return res;
    }
}