package 获取流的方式;

import java.util.*;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("赵七是");
        list.stream().forEach(name-> System.out.println(name));

        HashSet<String> set = new HashSet<>();
        set.add("李四");
        set.add("张三");
        set.add("王五");
        set.add("赵六");
        set.add("赵七是");
        Stream<String> stream = set.stream();
        stream.forEach(name-> System.out.println(name));

        //Map集合特殊
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"李四");
        map.put(2,"张三");
        map.put(3,"王五");
        map.put(4,"赵六");
        map.put(5,"赵七是");

        Stream<Integer> stream1 = map.keySet().stream();
        Stream<String> stream2 = map.values().stream();
        Stream<Map.Entry<Integer, String>> stream3 = map.entrySet().stream();

        String[] arr = {"李四",
                "张三",
                "王五",
                "赵六",
                "赵七是",};

        Stream<String> stream6 = Stream.of(arr);

        Stream<String> stream7 = Stream.of("李四",
                "张三",
                "王五",
                "赵六",
                "赵七是");


    }
}
