package nowcoder;

import java.util.Arrays;

/**
 * Created by liuyang on 17/3/7.
 */
public class Main {
    public static int[] getArray(int n, int l)
    {
        int[] result = new int[0];
        if ( n < 0) return result;
        if ( l <= 0 ) return result;
        if (( n == 0 ) && ( l == 1))
        {
            return new int[]{0};
        }
        int doubleN = 2*n;

        if ( l > 2*n) return result;

        for (int len = l; len <= 2*n; len++)
        {
            if ((doubleN)%len != 0) continue;

            int tmp = (doubleN)/len - len + 1;
            if ( tmp % 2 == 0)
            {
                int start = tmp /2;

                result = new int[len];
                for (int i = 0; i < len; i++ )
                {
                    result[i] = start++;
                }
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("(18,2): " + Arrays.toString(getArray(18,3)));
    }
}
