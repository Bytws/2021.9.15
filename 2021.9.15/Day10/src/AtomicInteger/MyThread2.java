package AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread2 extends Thread{
    static AtomicInteger a=new AtomicInteger();


    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            a.getAndIncrement();
        }
        System.out.println("子线程结束了");
    }
}
