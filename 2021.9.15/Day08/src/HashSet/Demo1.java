package HashSet;

import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<Student> s=new HashSet<>();
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",15);
        Student stu3 = new Student("王五",19);
        Student stu4 = new Student("赵六",17);
        Student stu5 = new Student("张三",18);

        s.add(stu1);
        s.add(stu2);
        s.add(stu3);
        s.add(stu4);
        s.add(stu5);

        System.out.println(s);

    }
}
