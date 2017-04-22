package nowcoder.balanceNumber;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: nowcoder.balanceNumber 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/4/3 下午4:19
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
/*
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = String.valueOf(num);
        int n = str.length();
        String flag = "NO";
        if (n < 2) {
            System.out.println(flag);
        }
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = i == 0 ? nums[0] : nums[i] * nums[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = i == n - 1 ? nums[i - 1] : nums[i] * nums[i + 1];
        }
        for (int i = 0; i < n - 2; i++) {
            if (left[i] == right[i + 1]) {
                flag = "YES";
                break;
            }
        }
        System.out.println(flag);
    }
}
*/
/*
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            String str = String.valueOf(num);
            int n = str.length();
            int flag = 0;
            long[] nums = new long[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            long[] left = new long[n];
            long[] right = new long[n];
            for (int i = 0; i < n; i++) {
                left[i] = i == 0 ? nums[0] : nums[i] * left[i - 1];
            }
            for (int i = n - 1; i >= 0; i--) {
                right[i] = i == n - 1 ? nums[n - 1] : nums[i] * right[i + 1];
            }
            for (int i = 0; i < n - 1; i++) {
                if (left[i] == right[i + 1]) {
                    flag = 1;
                    break;
                }
            }
            if (n < 2) {
                flag = 0;
            }
            if(flag==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
*/
public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int num = cin.nextInt();
            System.out.println(solve(num));
        }
    }

    public static String solve(int number) {
        String s = String.valueOf(number);
        int n = s.length();
        long n1;
        long n2;
        for (int i = 1; i < n; i++) {
            n1 = n2 = 1;
            for (int j = 0; j < i; j++)
                n1 *= s.charAt(j) - '0';
            for (int j = i; j < n; j++)
                n2 *= s.charAt(j) - '0';
            if (n1 == n2)
                return "YES";
        }
        return "NO";
    }


}
