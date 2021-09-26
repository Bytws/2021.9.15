package 线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        MyRunnable mr = new MyRunnable();
        es.submit(mr);
        es.submit(mr);
        es.submit(mr);
        es.submit(mr);
        es.submit(mr);

        es.shutdown();
    }
}
