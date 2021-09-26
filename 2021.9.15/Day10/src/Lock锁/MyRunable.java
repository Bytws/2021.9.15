package Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunable implements Runnable {
    //保证多个窗口使用的是同一个变量
    int tickets = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        //窗口卖票---线程要执行的任务
        while (true) {
            //加锁
            lock.lock();
            if (tickets < 1) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":正在出售第" + tickets + "张票");
            tickets--;
            //释放锁
            lock.unlock();
        }
    }
}
