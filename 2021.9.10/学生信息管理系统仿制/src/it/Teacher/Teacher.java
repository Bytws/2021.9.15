package it.Teacher;

import it.Person.Person;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    @Override
    public String getType() {
        return "老师。。。";
    }

    @Override
    public String getwork() {
        return "教java。。。";
    }
}
