package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class test {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("谷文杰");
        col.add("刘家衫");
        col.add("郭陆祥");
        System.out.println(col);

        col.clear();
        System.out.println(col);

        col.add("谷文杰");
        col.add("刘家衫");
        col.add("郭陆祥");
        col.remove("谷文杰");
        System.out.println(col);

        boolean res1 = col.contains("谷文杰");
        boolean res2 = col.contains("刘家衫");
        System.out.println(res1);
        System.out.println(res2);

        System.out.println(col.isEmpty());

        Object[] a = col.toArray();
        System.out.println(Arrays.toString(a));
    }
}
