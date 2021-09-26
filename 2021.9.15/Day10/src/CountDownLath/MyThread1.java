package CountDownLath;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class MyThread1 extends Thread{
    CountDownLatch cdl;


    public MyThread1(CountDownLatch cdl) {
        this.cdl = cdl;
    }


    @Override
    public void run() {
        System.out.println("A");
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
}
