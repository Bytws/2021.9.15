package 线程常用方法;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println("子线程j=" + j);
        }
    }

}
