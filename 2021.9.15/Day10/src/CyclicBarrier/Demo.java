package CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class Demo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("可以开始开会，会议内容是。。。。");
            }
        });

        MyRunnable mr  = new MyRunnable(cb);
         new Thread(mr,"员工1").start();
        new Thread(mr,"员工2").start();
        new Thread(mr,"员工3").start();
        new Thread(mr,"员工4").start();
        new Thread(mr,"员工5").start();
    }
}
