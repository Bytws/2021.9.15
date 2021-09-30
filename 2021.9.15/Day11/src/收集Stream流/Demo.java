package 收集Stream流;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("李四", "张三", "王五", "赵六", "赵七是");
        List<String> list = stream1.collect(Collectors.toList());
        System.out.println(list);
        Stream<String> stream2 = Stream.of("李四", "张三", "王五", "赵六", "赵七是");
        Set<String> set = stream2.collect(Collectors.toSet());
       System.out.println(set);
        Stream<String> stream3 = Stream.of("李四", "张三", "王五", "赵六", "赵七是");
        Object[] arr = stream3.toArray();
        System.out.println(arr);

    }
}
