package qihu.tasklist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by liuyang on 17/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] task = new int[n];
        for (int i = 0; i < n; i++) {
            task[i] = in.nextInt();
        }
        Arrays.sort(task);
        int min = task[0];
        int max = task[task.length - 1];
        int[] tmp = new int[m];
        for (int i = 0; i < m; i++) {
            tmp[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            if (tmp[i] < min || tmp[i] > max) {
                System.out.println(tmp[i]);
            } else if(tmp[i]==max){
                System.out.println(max+1);
            }else {
                System.out.println(find(task, tmp[i]));
            }
        }
    }

    public static int find(int[] task, int tmp) {
        int i;
        for (i = 0; i < task.length; i++) {
            if(i!=0&&task[i]>tmp&&task[i-1]<tmp){
                return task[i-1]+1;
            }
            if (task[i] >= tmp) {
                break;
            }
        }
        for (; i < task.length - 1; i++) {
            if (task[i] + 1 != task[i + 1]) {
                return task[i]+1;
            }
        }
        return task[task.length-1] + 1;
    }
}
