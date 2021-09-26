package 线程池练习;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(3);

        MyCallable mc = new MyCallable(100);
        Future<Integer> f = es.submit(mc);
        Integer res = f.get();
        System.out.println("1-100的累加和:"+res);
    }
}
