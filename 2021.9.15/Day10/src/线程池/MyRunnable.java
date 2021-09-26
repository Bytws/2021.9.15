package 线程池;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("开始:实现Runnable接口的任务....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束:实现Runnable接口的任务....");
    }
}
