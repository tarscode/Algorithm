package nowcoder;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by liuyang on 17/3/7.
 */
public class Super {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        n = in.nextInt();
        int p = 0;
        int q = 0;
        for (p = 3; p <= Math.sqrt(n); p++) {
            for (q = 2; Math.pow(p, q) <= n; q++) {
                if (Math.pow(p, q) == n) {
                    System.out.print(p);
                    System.out.print(' ');
                    System.out.print(q);
                    break;
                }

            }
        }
        //System.out.println(p);
        System.out.println(q);
        System.out.println("---");
        if (Math.pow(p, q) == n) {
            System.out.println(p + ' ' + q);
        } else {
            System.out.println("No");
        }
    }
}
