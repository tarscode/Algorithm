package qunar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by liuyang on 17/4/3.
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for(int i=1;i<100;i++){
            list1.add(i);
            list2.addLast(i);
            list3.add(i);
        }
        for(int i:list1){
            System.out.println(i);
        }

        System.out.println("-------");

        for(int i:list2){
            System.out.println(i);
       }
    }
}
