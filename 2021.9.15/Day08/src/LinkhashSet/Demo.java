package LinkhashSet;

import java.util.LinkedHashSet;

public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();

        list.add(500);
        list.add(300);
        list.add(400);
        list.add(600);
        list.add(100);

        System.out.println(list);//元素存取有序，怎么存怎么输出
    }
}
