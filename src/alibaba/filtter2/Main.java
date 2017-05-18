package alibaba.filtter2;


import java.util.Scanner;

public class Main {

    private static int filter(String str, String pattern) {
        if ((str == null || pattern == null)) {
            return 0;
        }
        char[] strArr = str.toCharArray();
        char[] patternArr = pattern.toCharArray();
        return filterCore(strArr, 0, patternArr, 0) == true ? 1 : 0;
    }

    private static boolean filterCore(char[] string, int i, char[] mode, int j) {
        if ((i == string.length) && (j == mode.length)) {
            return true;
        }
        if ((i != string.length) && (j == mode.length)) {
            return false;
        }
        if (j + 1 < mode.length && mode[j + 1] == '*') {
            if ((i != string.length && string[i] == mode[j]) || (mode[j] == '?' && i != string.length)) {
                return filterCore(string, i + 1, mode, j + 2)
                        || filterCore(string, i + 1, mode, j)
                        || filterCore(string, i, mode, j + 2);
            } else {
                return filterCore(string, i, mode, j + 2);
            }
        }
        if ((i != string.length && string[i] == mode[j]) || (mode[j] == '?' && i != string.length)) {
            return filterCore(string, i + 1, mode, j + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.next();
        String patternMode = input.next();
        System.out.println(filter(string, patternMode));
    }
}
