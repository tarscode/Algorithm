package ctrip.test4;

/**
 * Created by liuyang on 17/4/11.
 */
public class Test {
    public static void main(String[] args) {
        try {
            int c = 9/0;
        } catch (ArithmeticException e2){
            System.out.println("222");
        } catch (Exception e1){
            System.out.println("ecggg");
        }
    }
}
