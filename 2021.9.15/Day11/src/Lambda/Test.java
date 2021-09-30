package Lambda;

public class Test {
    public static void main(String[] args) {
        // 方法一:
        //        MyRunnable mr = new MyRunnable();
//        new Thread(mr).start();


        Thread t3 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("子线程i="+i);
            }
        });
        t3.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程i="+i);
        }
    }
}
