package 流的方法;

import java.util.stream.Stream;

public class CountDemo {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("李四",
                "张三",
                "王五",
                "赵六",
                "赵七是");
        long count = stream1.count();
        System.out.println(count);
    }
}
