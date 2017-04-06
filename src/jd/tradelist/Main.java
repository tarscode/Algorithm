package jd.tradelist;

import java.util.*;

/**
 * 【工程】: Algorithm 包名: jd.tradelist 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/6 下午7:00
 * 【题目】: 交易清单
 * 【内容】: 交易处理中，需要把同类业务（买入或卖出）中相同价格的所有委托合并起来，形成一个清单。清单的第一部分为按价格降序排列的合并后
 * 的卖出委托，紧随其后的是按相同顺序排列的买入合并委托。证券公司比较关心的是比较抢手的s条合并委托信息，需要得到买入及卖出最抢手的s条合
 * 并委托。对于买入委托，抢手的是指报价高的委托，而卖出委托中报价低的较为抢手。若买或卖的合并委托数小于s条，则全部列入清单中。
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
        while(in.hasNextInt()) {
            int n = in.nextInt();
            int s = in.nextInt();
            TreeMap<Integer, Integer> buy = new TreeMap<>();
            TreeMap<Integer, Integer> sell = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                String flag = in.next();
                int p = in.nextInt();
                int q = in.nextInt();
                if (flag.equals("B")) {
                    if (buy.containsKey(p)) {
                        buy.put(p, q + buy.get(p));
                    } else {
                        buy.put(p, q);
                    }
                }
                if (flag.equals("S")) {
                    if (sell.containsKey(p)) {
                        sell.put(p, q + sell.get(p));
                    } else {
                        sell.put(p, q);
                    }
                }
            }

            Iterator<Integer> sellIt = sell.descendingKeySet().iterator();
            int count = 0;
            while (sellIt.hasNext()) {
                int p = sellIt.next();
                int q = sell.get(p);
                System.out.println("S " + p + " " + q);
                count++;
                if (count == s) {
                    break;
                }
            }

            Iterator<Integer> buyIt = buy.descendingKeySet().iterator();
            count = 0;
            while (buyIt.hasNext()) {
                int p = buyIt.next();
                int q = buy.get(p);
                System.out.println("B " + p + " " + q);
                count++;
                if (count == s) {
                    break;
                }
            }
        }

    }
}