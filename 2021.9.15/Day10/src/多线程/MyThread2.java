package 多线程;

public class MyThread2 extends Thread{
    volatile static int a = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            a++;
        }
        System.out.println("子线程结束了");
    }
}
