package 线程池练习;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
}
