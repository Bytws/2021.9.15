package 线程;

public class Demo2 {
    public static void main(String[] args) {
        MyRunnable mr =new MyRunnable();
        Thread ti = new Thread(mr);

        ti.start();

        for (int j = 0; j < 100; j++) {
            System.out.println("主线程j="+j);
        }

    }
}
