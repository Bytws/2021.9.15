package 同步代码块;

public class MyRunable implements Runnable{
    //保证多个窗口使用的是同一个变量
    int tickets = 100;
    @Override
    public void run() {
        //窗口卖票---线程要执行的任务
        while (true) {
            if(sellTickets()) break;
        }
    }

    private synchronized boolean sellTickets() {
        if(tickets<1){
            return true;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":正在出售第" + tickets + "张票");
        tickets--;
        return false;
    }
}
