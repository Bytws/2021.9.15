package it.Student;

import it.Person.Person;

public class Student extends Person {
    public Student() {
    }

    public Student(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getwork() {
        return "学java。。。";
    }

}
