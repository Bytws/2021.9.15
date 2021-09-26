package Semaphore;

public class Demo {
    public static void main(String[] args) {
        ClassRoom cr = new ClassRoom();
        MyRunnable mr = new MyRunnable(cr);

         new Thread(mr,"同学1").start();
        new Thread(mr,"同学2").start();
        new Thread(mr,"同学3").start();
        new Thread(mr,"同学4").start();
        new Thread(mr,"同学5").start();
    }
}
