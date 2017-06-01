package xiaomi.autumn2017.git;

import java.util.List;

/**
 * 【工程】: Algorithm 包名: xiaomi.autumn2017.git 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/5/31 下午6:55
 * 【题目】: 小米Git
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Main {

    /**
     * 返回git树上两点的最近分割点
     *
     * @param matrix 接邻矩阵，表示git树，matrix[i][j] == '1' 当且仅当git树中第i个和第j个节点有连接，节点0为git树的跟节点
     * @param indexA 节点A的index
     * @param indexB 节点B的index
     * @return 整型
     */
    public int getSplitNode(String[] matrix, int indexA, int indexB) {
        int n = matrix.length;
        char[][] arr = new char[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = matrix[i].toCharArray();
        }
        return indexA;
    }

    public static void main(String[] args) {
        Main t = new Main();
        System.out.println();
    }
}

class Node {
    int val = 0;
    List<Node> childNode = null;

    public Node(int val) {
        this.val = val;
    }
}