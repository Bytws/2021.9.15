package CopyOnWriteArrayList;

public class Demo {
    public static void main(String[] args) {
         new MyThread().start();
        new MyThread().start();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(MyThread.list.size());

    }
}
