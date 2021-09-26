package 同步代码块;

import 同步代码块.MyRunable;

public class Demo {
    public static void main(String[] args) {
        //使用多线程模拟四个窗口共同出售一百张票

        //创建MyRunable实现类对象（任务对象）
        MyRunable mr = new MyRunable();
        //创建4条线程，并启动

        new Thread(mr, "窗口1").start();
        new Thread(mr, "窗口2").start();
        new Thread(mr, "窗口3").start();
        new Thread(mr, "窗口4").start();


    }
}
