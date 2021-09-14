package 泛型通配符;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String>  list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Object>  list3 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
    }

    private static void method(ArrayList<?> list1) {
    }
}
