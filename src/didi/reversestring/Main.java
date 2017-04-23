package didi.reversestring;

import java.util.Scanner;

/**
 * Created by Tars on 2017/4/22 0022.
 * 翻转字符串中的每一个单词
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        int len = str.length();
        int begin =0;
        int end;
        for(int i=0;i<len;i++){
            if(arr[i]==' '){
                end = i;
                Reverse(arr,begin,end-1);
                begin=end+1;
            }

            if(i==len-1){
                Reverse(arr,begin,i);
            }


        }
        //arr = Reverse(arr,0,len-1);
        str = String.valueOf(arr);
        System.out.println(str);
    }
    public static char[] Reverse(char[] arr,int begin,int end){
        while(begin<end){
            char temp = arr[begin];
            arr[begin++]=arr[end];
            arr[end--] = temp;
        }
        return arr;
    }
}
