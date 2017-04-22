package qihu.NumberString;

import java.util.Scanner;

/**
 * Created by liuyang on 17/3/28.
 * 过了80%
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int num = 0;
        //生成字符串的子串
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j <= str.length() - i; j++) {
                String tmp = str.substring(j, j + i);
                System.out.println(tmp);
                if (judge(tmp)) {
                    num++;
                }
            }
        }
        System.out.print(num);
    }

    //判断字符串是否为偶数串
    public static boolean judge(String str) {
        int[] map = new int[256];
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            map[arr[i]]++;
        }
        for (int i : map) {
            if (i != 0 && i % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
/*
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String T = sc.next();
            int count = 0;//记录总的偶串数目
            int gi = 0; //gi是用低26bit（int是32bit）表示下标为[0,i]的子串所拥分别有的字母是偶数个（0）还是奇数个（1）。
            Map<Integer,Integer> map = new HashMap<Integer,Integer>(); //保存每个gi出现次数
            map.put(0, 1);//gi为0，表示所有的字母都出现偶数次，是1个偶串，所以赋初值1
            for(int i=0; i<T.length(); i++){
                int x = T.charAt(i) - 'a'; //求得新加入的这个字符的bit位置
                gi ^= (1 << x);  //求加入这个字符后，原来的gi拥有字母个数的奇偶性。如果异或后是0，表示加入该字符后有偶数个字母，反正是奇数个。
                if(map.containsKey(gi)){
                    count += map.get(gi);//g0,g1,g2...g(i-1)和gi相等的，都可以得到一个偶串。有多个少个相等，就有多少个偶串。
                    map.put(gi, map.get(gi)+1); //增加1
                }else{
                    map.put(gi, 1);
                }

            }
            System.out.println(count);
        }

    }

}
*/
