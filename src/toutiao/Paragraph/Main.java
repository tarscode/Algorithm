package toutiao.Paragraph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by liuyang on 17/3/30.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mn = in.nextLine();
        String[] tmp2 = mn.split(" ");
        int n = Integer.valueOf(tmp2[0]);
        int m = Integer.valueOf(tmp2[1]);
        //int n = in.nextInt();
        //int m = in.nextInt();
        String[] strN = new String[n];
        String[][] arrN = new String[n][];
        int k = 0;
        for (int i = 0; i < n; i++) {
            k++;
            String tmp = in.nextLine();
            if(tmp.equals(null)||tmp.length()==0){
                System.out.println("null is true");
                i--;
                continue;
            }
            strN[i] = tmp;
            System.out.println("k"+k+"---句子---"+tmp);
            arrN[i] = tmp.split(" ");
        }
        String[][] arrM = new String[m][];
        for (int i = 0; i < m; i++) {
            k++;
            String tmp = in.nextLine();
            System.out.println("k:"+k+"---判断---i:"+i+" "+tmp);
            arrM[i] = tmp.split(" ");
            toLowCase(arrM[i]);
        }
        int[] max = new int[m];
        int[] flag = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = count(arrM[i], arrN[j]);
             //   System.out.println("i:"+i+"j:"+j+" "+num);
                if (num > max[i]) {
                    max[i] = num;
                    flag[i] = j;
                }
            }
        }
        for(int i=0;i<m;i++){
            int index = flag[i];
            System.out.println(strN[index]);
        }
    }

    public static int count(String[] arrA, String[] arrB) {
        int num = 0;
        Set<String> set = new HashSet<String>(Arrays.asList(arrA));
        for (String str : set) {
            for (int j = 0; j < arrB.length; j++) {
                if (str.equalsIgnoreCase(arrB[j])) {
                    num++;
                    break;
                }
            }
        }
        return num;
    }

    public static void toLowCase(String[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i].toLowerCase();
        }
    }

}
