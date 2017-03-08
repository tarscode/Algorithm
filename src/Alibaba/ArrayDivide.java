package Alibaba;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuyang on 17/3/3.
 * 阿里实习笔试题数组四等分,最后通过率80%
 */
public class ArrayDivide{
    static boolean resolve(int[] A) {
        if (A == null || A.length < 3) {
            return false;
        }
        int len = A.length;
        int[] sum = new int[len]; //当前位置累加和
        Map<Integer, Integer> map = new HashMap<>();//累加和对应的下标
        for (int i = 0; i < len; i++) {
            sum[i] = i != 0 ? sum[i - 1] + A[i] : A[i];
            map.put(sum[i], i);
        }
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (sum[left] < sum[len - 1] - sum[right - 1]) {
                left++;
            } else if (sum[left] > sum[len - 1] - sum[right - 1]) {
                right--;
            } else {
                int target = sum[left] + A[left + 1] + sum[left];
                if (map.containsKey(target)) {
                    int mid = map.get(target);
                    if (mid < right && sum[right - 2] - sum[mid + 1] == sum[left]) {
                        return true;
                    }
                }
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 1, 2, 1, 4, 1, 7, 3, 7};
        System.out.println(resolve(A));
    }
}
