package 线程;

public class Demo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100; i++) {
                    System.out.println("子线程i="+i);
                }
            }
        });
        t1.start();

        for (int j = 0; j < 100; j++) {
            System.out.println("主线程j="+j);
        }


    }
}
