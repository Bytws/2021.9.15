package 流的方法;

import java.util.stream.Stream;

public class ConcatDemo {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("jacj", "rose");
        Stream<String> stream2 = Stream.of("18", "19");

        Stream.concat(stream1,stream2).forEach(str-> System.out.println(str));
    }
}
