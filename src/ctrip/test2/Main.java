package ctrip.test2;

/**
 * Created by liuyang on 17/4/11.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Main {

    /*请完成下面这个函数，实现题目要求的功能*/
    /*当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ */

    /******************************开始写代码******************************/
    static int run(String numbers) {
        String target = "0123456789";
        int n = numbers.length();
        if (numbers.equals(target)) {
            return 0;
        }
        int begin = 0;
        for (int i = 0; i < n; i++) {
            if (numbers.charAt(i) == '0') {
                begin = i;
                break;
            }
        }
        int flag = begin;
        int step = 0;
        while (step<100){
            if(flag==0){

            }
        }
        return -1;

    }

    /******************************结束写代码******************************/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numbers = new String();
        for (int rows = 3; rows > 0; rows--) {
            for (String n : scan.nextLine().split(" ")) {
                numbers += n;
            }
        }

        int res = run(numbers);

        System.out.println(String.valueOf(res));
    }
}

