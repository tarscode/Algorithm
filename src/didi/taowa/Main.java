package didi.taowa;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Tars on 2017/4/22 0022.
 * 套娃问题
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        TreeMap<Integer, Integer> map2 = new TreeMap<Integer, Integer>();
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            int w = in.nextInt();
            int h = in.nextInt();
            if (map.containsKey(w)) {
                if (map.get(w) < h) {
                    map.put(w, h);
                }
            } else {
                map.put(w, h);
            }
            int tmp = w;
            w = h;
            h = tmp;
            if (map2.containsKey(w)) {
                if (map2.get(w) < h) {
                    map2.put(w, h);
                }
            } else {
                map2.put(w, h);
            }
        }
        Iterator it = map.keySet().iterator();
        int[] arr = new int[map.size()];
        int p = 0;
        while (it.hasNext()) {
            int h = (int) it.next();
            arr[p++] = h;
        }
        Iterator it2 = map2.keySet().iterator();
        int[] arr2 = new int[map.size()];
        int p2 = 0;
        while (it2.hasNext()) {
            int h = (int) it.next();
            arr2[p++] = h;
        }
        System.out.println(getLIS(arr,arr.length));
    }

    public static int getLIS(int[] A, int n) {
        int dp[] = new int[n];
        int len = 1;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            len = dp[i] > len ? dp[i] : len;
        }
        return len;
    }

}
