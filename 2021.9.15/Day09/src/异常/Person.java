package 异常;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        if(age<0||age>120){
            //首先创建异常，并传入需要打印的错误信息。并用thorw抛出异常
            throw new RuntimeException("年龄数据不合法");

        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
