package 流的方法;

import java.util.stream.Stream;

public class mapDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("18", "19");
        stream.map((String str)->{return Integer.valueOf(str);}).forEach(name-> System.out.println(name));
    }
}
