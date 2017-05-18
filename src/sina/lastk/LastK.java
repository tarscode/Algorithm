package sina.lastk;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 【工程】: Algorithm 包名: sina.lastk 类名: LastK
 * 【作者】: liuyang
 * 【时间】: 17/4/23 下午1:16
 * 【题目】:
 * 【内容】:
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class LastK {

    public static void main(String[] args) {
    }
    public int getLastK(LinkedList<Integer> list,int k){
        int len = list.size();
        Iterator it = list.iterator();
        int target =len-k;
        int i=0;
        int sum = 0;
        while(it.hasNext()){
            i++;
            int val = (int)it.next();
            if(i>=target){
               sum += val;
            }
        }
        return sum;
    }
}