package HashMap练习;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {

        HashMap<Student ,String> map = new HashMap<>();

        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",17);
        Student s4 = new Student("张三",18);
        map.put(s1,"深圳");
        map.put(s2,"西安");
        map.put(s3,"长沙");
        map.put(s4,"株洲");

        System.out.println(map);
        System.out.println(map.size());
    }
}
