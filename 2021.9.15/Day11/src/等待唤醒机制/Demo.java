package 等待唤醒机制;

public class Demo {
    public static Object obj = new Object();

    public static void main(String[] args) {
        //线程一
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("线程1：准备调用wait方法进入无限等待");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程1:被唤醒了...");
                }
            }
        }).start();
        //线程二
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("线程2：准备调用notify唤醒等待线程");
                    obj.notify();

                }

            }
        }).start();
    }
}
