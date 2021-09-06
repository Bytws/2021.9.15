package 存储学生对象;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("张柏芝",32);
        Student s3 = new Student("王祖贤",23);
        array.add(s1);
        array.add(s2);
        array.add(s3);
        for(int i=0;i<array.size();i++){
            Student a = array.get(i);
            System.out.println("姓名："+a.getName()+" 年龄:"+a.getAge());
        }
    }
}
