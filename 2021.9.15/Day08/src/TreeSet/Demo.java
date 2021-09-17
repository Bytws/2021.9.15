package TreeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
     public static void main(String[] args) {
        TreeSet<Integer> list = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1-integer;
            }
        });

        list.add(500);
        list.add(300);
        list.add(400);
        list.add(600);
        list.add(100);


        System.out.println(list);//元素存取有序，怎么存怎么输出
    }
}
