package alibaba.filter;


import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: alibaba.filter 类名: Main
 * 【作者】: Tars
 * 【时间】: 2017/4/26 0026 20:02
 * 【题目】: 消息正则匹配
 * 【内容】: ‘?’ 匹配一个字符
 * ‘*’ 匹配任意连串的字符
 * 如上面的例子中，购物车平台订阅方式是pattern=*trade-done，那么
 * filter(100-trade-done, pattern) = 1,
 * filter(200-trade-done, pattern) = 1,
 * filter(200-paid-done, pattern) = 0
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:正则匹配
 */
public class Main {

    private static int filter(String str, String pattern) {
        if ((str == null || pattern == null)) {
            return 0;
        }
        char[] strArr = str.toCharArray();
        char[] patternArr = pattern.toCharArray();
        return isMatch(str, pattern) == true ? 1 : 0;

    }


    public static boolean isMatch(String s, String p) {

        if (s == null || p == null) {
            return false;
        }
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*' && dp[0][i-1]) {
                dp[0][i+1] = true;
            }
        }
        for (int i = 0 ; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '?') {
                    dp[i+1][j+1] = dp[i][j];
                }
                if (p.charAt(j) == s.charAt(i)) {
                    dp[i+1][j+1] = dp[i][j];
                }
                if (p.charAt(j) == '*') {
                    if (p.charAt(j-1) != s.charAt(i) && p.charAt(j-1) != '?') {
                        dp[i+1][j+1] = dp[i+1][j-1];
                    } else {
                        dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();
        String pattern = in.next();
        System.out.println(filter(str, pattern));



    }
}
