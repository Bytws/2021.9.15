package it.Person;

public abstract class Person {
    /**
    *编号
    */
    private int id;
    /**
     *姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 年龄
     */
    private int age;

    public Person() {
    }

    public Person(int id, String name, String sex, String birthday, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.age = age;
    }
    //set get

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract String getType();
    public abstract String getwork();

    public String show(){
        return "我是一名："+getType()+"，我的工作是："+getwork();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                '}';
    }
}
