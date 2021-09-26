package 多线程;

public class MyThread extends Thread{
    static boolean flag =false;

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag 的值改成了 true");
    }
}

