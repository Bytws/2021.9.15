package CountDownLath;

import java.util.concurrent.CountDownLatch;

public class MyThread2 extends Thread{
    CountDownLatch cdl;

    public MyThread2(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        System.out.println("B");
        cdl.countDown();
    }
}
