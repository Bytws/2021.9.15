package 流的方法;

import java.util.stream.Stream;

public class filterDemo {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("李四",
                "张三",
                "王五",
                "赵六",
                "赵七是");
        stream1.filter((String name)->{
            System.out.println("filter方法");
            return name.startsWith("赵");}).forEach(name -> System.out.println(name));
    }
}
