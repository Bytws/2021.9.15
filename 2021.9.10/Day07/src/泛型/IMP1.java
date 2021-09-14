package 泛型;

public class IMP1 implements IA<String> {

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
