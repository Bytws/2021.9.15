package 流的综合案例;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String>  one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");
        ArrayList<String>  two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        //第一个队伍只要名字为3个字的成员姓名
        //第一个队伍筛选后只要前3个人
        Stream<String> stream1 = one.stream().filter((String name) -> {
            return name.length() == 3;
        }).limit(3);

        //第二个队伍只要姓张的成员姓名
        //第二个队伍 筛选后不要前2个人
        Stream<String> stream2 = two.stream().filter((String name) -> {
            return name.startsWith("张");
        }).skip(2);
        //将两个队伍合并为一个队伍
        //根据姓名创建Person对象
        //打印整个Person对象信息
        Stream.concat(stream1,stream2).map((String name)->{return new Person(name);
        }).forEach((Person p)->{
            System.out.println(p);
        });
    }
}
