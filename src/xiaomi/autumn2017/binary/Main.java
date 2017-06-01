package xiaomi.autumn2017.binary;

/**
 * 【工程】: Algorithm 包名: xiaomi.autumn2017.binary 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/31 下午6:57
 * 【题目】: 懂二进制
 * 【内容】: 世界上有10种人，一种懂二进制，一种不懂。那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】: int转换成二进制String进行比较时注意从后向前比较各bit是否相同,需要将二进制字符串逆序,计算较为方便
 * 【思路】:
 */
public class Main {

    public int countBitDiff(int m, int n) {
        String mStr = Integer.toBinaryString(m);
        String nStr = Integer.toBinaryString(n);
        mStr = reverse(mStr);
        nStr = reverse(nStr);
        int mlen = mStr.length();
        int nlen = nStr.length();
        String str = mlen > nlen ? mStr : nStr;
        int right = Math.min(mlen, nlen); //获取两个字符串中较小的长度
        int left = Math.max(mlen, nlen);
        int num = 0;
        for (int i = 0; i < left; i++) {
            if (i < right) { //0至right-1范围内:两个字符串按位比较是否相同
                if (mStr.charAt(i) != nStr.charAt(i)) {
                    num++;
                }
            } else { //right至left-1范围内:短字符串全是'0',较长的字符串和'1'比较是否相同
                if (str.charAt(i) == '1') {
                    num++;
                }
            }
        }
        return num;
    }

    //返回字符串逆序
    private static String reverse(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        return String.valueOf(arr);
    }


    public static void main(String[] args) {
        Main t = new Main();
        System.out.println(t.countBitDiff(16807,282475249));
    }
}