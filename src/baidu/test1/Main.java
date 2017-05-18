package baidu.test1;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 * 【工程】: Algorithm 包名: baidu.test1 类名: Main
 * 【作者】: Tars
 * 【时间】: 2017/4/27 0027 18:45
 * 【题目】:
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
        int n = in.nextInt();
        TreeSet<Integer> value = new TreeSet<>();
        for (int i = 0; i < n; i++){
            value.add(in.nextInt());
        }
        if (value.size() < 3)
            System.out.println(-1);
        else{
            int count = 0;
            int three = 0;
            for (Iterator iter = value.iterator(); iter.hasNext();){
                three = (int) iter.next();
                count++;
                if (count == 3)
                    break;
            }
            System.out.println(three);
        }
    }
}
