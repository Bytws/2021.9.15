package 流的方法;

import java.util.ArrayList;
import java.util.stream.Stream;

public class foreachDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("赵七是");

        Stream<String> stream = list.stream();
        stream.forEach(name-> System.out.println(name));
    }
}
