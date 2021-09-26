package AtomicInteger;

public class Test2 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        mt.start();

        for (int i = 0; i < 100000; i++) {
            MyThread2.a.getAndIncrement();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("a:"+ MyThread2.a);
    }
}
