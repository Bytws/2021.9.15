package 线程常用方法;

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("线程1");
        t1.start();

        MyThread t2 = new MyThread("线程2");
        t2.start();


        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 i = "+i);
        }
    }
}
