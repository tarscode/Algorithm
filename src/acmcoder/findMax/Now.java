package acmcoder.findMax;

/**
 * 【工程】: Algorithm 包名: acmcoder.findMax 类名: Now
 * 【作者】: liuyang
 * 【时间】: 17/3/25 下午2:13
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Now {

    public static void main(String[] args) {
        int res = fib(fib(2));
        System.out.println(res);
    }
    static  int  fib(int x){
        return ((x>0)?x*fib(x-1):2);
    }
}