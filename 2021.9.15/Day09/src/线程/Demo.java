package 线程;

public class Demo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.start();

        for (int j = 0; j < 100; j++) {
            System.out.println("主线程j="+j);
        }
    }
}
