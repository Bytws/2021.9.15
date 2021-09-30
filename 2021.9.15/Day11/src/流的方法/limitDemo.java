package 流的方法;

import java.util.stream.Stream;

public class limitDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("李四",
                "张三",
                "王五",
                "赵六",
                "赵七是");
        stream.limit(3).forEach(name -> System.out.println(name));
    }
}
