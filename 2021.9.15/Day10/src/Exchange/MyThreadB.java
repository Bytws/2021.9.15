package Exchange;

import java.util.concurrent.Exchanger;

public class MyThreadB extends Thread{
    Exchanger<String> ex;

    public MyThreadB(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        System.out.println("线程B准备把数据传给线程A：");
        try {
            String messageA = ex.exchange("数据B");
            System.out.println("线程A给的数据是："+messageA);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
