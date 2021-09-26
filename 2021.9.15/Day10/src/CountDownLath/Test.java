package CountDownLath;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) {

        CountDownLatch cdl = new CountDownLatch(1);
        new MyThread1(cdl).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new MyThread2(cdl).start();
    }
}
