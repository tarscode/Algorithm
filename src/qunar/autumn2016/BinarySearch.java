package qunar.autumn2016;

/**
 * 【工程】: Algorithm 包名: qunar.autumn2016.find 类名: BinarySearch
 * 【作者】: liuyang
 * 【时间】: 17/6/7 下午7:11
 * 【题目】: 二分查找
 * 【内容】: 对于一个有序数组，我们通常采用二分查找的方式来定位某一元素，请编写二分查找的算法，在数组中查找指定元素。
 * 给定一个整数数组A及它的大小n，同时给定要查找的元素val，请返回它在数组中的位置(从0开始)，若不存在该元素，返回-1。若
 * 该元素出现多次，请返回第一次出现的位置。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class BinarySearch {
    public int getPos(int[] A, int n, int val) {
        int left = 0;
        int right = n - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (A[mid] == val) { //找到
                if (mid == 0 || A[mid - 1] != val) { //坐标为0或者与左边的值不同为最先出现的情况
                    return mid;
                } else {
                    right = mid - 1; //不满足条件,继续二分
                }
            } else if (A[mid] > val) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {4, 4, 10, 21};
        BinarySearch b = new BinarySearch();
        System.out.println(b.getPos(A, A.length, 4));
    }
}