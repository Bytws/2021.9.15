package Lambda;

public class Test2 {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("=====");
        }).start();
    }
}
