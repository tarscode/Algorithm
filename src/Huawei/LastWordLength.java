package Huawei;

import java.util.Scanner;

/**
 * Created by liuyang on 17/3/7.
 */
public class LastWordLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = 0;
        for(int i = str.length()-1;i>=0;i--){
           if(str.charAt(i)==' '){
               break;
           }
           len++;
        }
        System.out.print(len);
    }
}
