package ctrip.test1;

/**
 * 【工程】: Algorithm 包名: ctrip.reversestring 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/11 下午6:52
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
        Main t = new Main();
        System.out.println();

        System.out.println(mt(15));
    }


    public static int mt(int a)
    {
        int i, j;
        int[] m = new int[a+1];
        int[] t = new int[a+1];

        for (i = 0; i < a; i++)   //m、t初始化
        {
            m[i] = i;
            t[i] = i;
        }
        for (i = 4; i <= a; i++)         //按自底向上来得到m与t的值
        {
            for (j = 2; j <= i/2; j++)
            {
                if (m[i]  <= m[j] * m[i - j])
                {
                    m[i] = m[j] * m[i - j];
                    t[i] = j;
                }
            }
        }
        return m[a-1];
    }
}