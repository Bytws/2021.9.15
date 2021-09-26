package Lock锁;

import 同步代码块.MyRunable;

public class Demo {
    public static void main(String[] args) {
        同步代码块.MyRunable mr = new MyRunable();
        //创建4条线程，并启动

        new Thread(mr, "窗口1").start();
        new Thread(mr, "窗口2").start();
        new Thread(mr, "窗口3").start();
        new Thread(mr, "窗口4").start();
    }

}
