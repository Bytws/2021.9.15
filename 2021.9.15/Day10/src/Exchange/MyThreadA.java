package Exchange;

import java.util.concurrent.Exchanger;

public class MyThreadA extends Thread{
    Exchanger<String> ex;

    public MyThreadA(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        System.out.println("线程A准备把数据传给线程B：");
        try {
             String messageB = ex.exchange("数据A");
            System.out.println("线程B给的数据是："+messageB);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
