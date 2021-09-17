package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1-integer;
            }
        });

        map.put(5,"谷文杰");
        map.put(3,"刘家衫");
        map.put(1,"郭陆祥");
        map.put(2,"汤文顺");

        System.out.println(map);
    }
}
