package Collections工具类;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Conllections是一个工具类主要对我们单列集合list进行操作
        List<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(400);
        list.add(232);
        list.add(444);
        list.add(2233);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1-integer;
            }
        });
        System.out.println(list);

    }
}
