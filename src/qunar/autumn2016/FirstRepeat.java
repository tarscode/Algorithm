package qunar.autumn2016;

/**
 * 【工程】: Algorithm 包名: qunar.autumn2016 类名: FirstRepeat
 * 【作者】: liuyang
 * 【时间】: 17/6/7 下午7:26
 * 【题目】: 首个重复字符
 * 【内容】: 对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。给定一个字符串(不一定全为字母)A及
 * 它的长度n。请返回第一个重复出现的字符。保证字符串中有重复字符，字符串的长度小于等于500。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class FirstRepeat {

    public char findFirstRepeat(String A, int n) {
        char[] arr = A.toCharArray();
        int[] map = new int[255];
        for (int i = 0; i < n; i++) {
            if (map[arr[i]]++ >= 1) { //map为2时表示重复
                return arr[i];
            }
        }
        return '0'; //这个永远不会返回,不知道设置什么好
    }

    public static void main(String[] args) {
        FirstRepeat t = new FirstRepeat();
        String str = "qywyer23tdd";
        System.out.println(t.findFirstRepeat(str, str.length()));
    }
}