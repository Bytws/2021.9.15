package 死锁;

public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized("锁A"){
                    System.out.println("线程A:获取到了A锁,等待获取B锁");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized ("锁B"){
                        System.out.println("线程A：获取到了A锁和B锁，开始执行代码。。");
                    }
                }
            }
        }, "线程A").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized("锁B"){
                    System.out.println("线程B:获取到了B锁，等待获取A锁");
                    synchronized ("锁A"){
                        System.out.println("线程B：获取到了A锁和B锁，开始执行代码。。");
                    }
                }
            }
        }, "线程B").start();
    }
}
